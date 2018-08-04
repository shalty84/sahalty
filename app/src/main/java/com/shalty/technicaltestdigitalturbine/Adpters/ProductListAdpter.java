package com.shalty.technicaltestdigitalturbine.Adpters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.shalty.technicaltestdigitalturbine.Interfaces.RecyclerItemClickListener;
import com.shalty.technicaltestdigitalturbine.R;
import com.shalty.technicaltestdigitalturbine.types.Ad;

import java.util.List;

public class ProductListAdpter extends RecyclerView.Adapter<ProductListAdpter.ProductHolder> {

    private List<Ad> productList;
    private RecyclerItemClickListener context;

    public class ProductHolder extends RecyclerView.ViewHolder {
        ImageView productThumbnail;
        public TextView productName;
        public RatingBar rating;
        public ProductHolder(View view) {
            super(view);
            productThumbnail = view.findViewById(R.id.productThumbnail);
            productName =  view.findViewById(R.id.productName);
            rating =  view.findViewById(R.id.rating);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.onItemClick(getAdapterPosition());
                }
            });
        }
    }


    public ProductListAdpter(List<Ad> moviesList, RecyclerItemClickListener context) {
        this.productList = moviesList;
        this.context = context;
    }

    @Override
    public ProductHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new ProductHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ProductHolder holder, int position) {
        Ad Product = productList.get(position);
        holder.productName.setText(Product.getProductName());
        holder.rating.setNumStars(Integer.parseInt(Product.getRating()));




    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}