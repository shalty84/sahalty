package com.shalty.technicaltestdigitalturbine.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shalty.technicaltestdigitalturbine.Adpters.ProductListAdpter;
import com.shalty.technicaltestdigitalturbine.Interfaces.RecyclerItemClickListener;
import com.shalty.technicaltestdigitalturbine.R;
import com.shalty.technicaltestdigitalturbine.Util.AppData;
import com.shalty.technicaltestdigitalturbine.types.Ad;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeScreen extends Fragment {


    public HomeScreen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_screen, container, false);

        List<Ad> prodacts = new ArrayList<Ad>();
//        prodacts.add(new Ad("shalty","https://prod-static-images.s3.amazonaws.com/shared/creatives/15338/1385be772f424a3cb42cd8f07747b05b.png",
//                "Match your way to meet the wonderful Wizard of Oz in this amazing puzzle adventure!",0.5F));


        RecyclerView prodactListRV = view.findViewById(R.id.adList);
        ProductListAdpter productListAdpter = new ProductListAdpter(prodacts,(RecyclerItemClickListener) getActivity());
        prodactListRV.setLayoutManager(new LinearLayoutManager(getContext()));
        prodactListRV.setItemAnimator(new DefaultItemAnimator());
        prodactListRV.setAdapter(productListAdpter);


        return  view;
    }

}
