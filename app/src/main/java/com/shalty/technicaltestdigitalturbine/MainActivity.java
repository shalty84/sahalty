package com.shalty.technicaltestdigitalturbine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.shalty.technicaltestdigitalturbine.Interfaces.RecyclerItemClickListener;
import com.shalty.technicaltestdigitalturbine.Interfaces.RetrofitProdactClient;
import com.shalty.technicaltestdigitalturbine.Util.AppData;
import com.shalty.technicaltestdigitalturbine.Util.RetrofitClientInstance;
import com.shalty.technicaltestdigitalturbine.fragment.HomeScreen;
import com.shalty.technicaltestdigitalturbine.fragment.ShowItem;
import com.shalty.technicaltestdigitalturbine.types.Ads;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements RecyclerItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout fl = findViewById(R.id.fragmentContainer);
        AppData.addOrReplaceFragment(fl,new HomeScreen(),this);


        RetrofitProdactClient service = RetrofitClientInstance.getRetrofitInstance().create(RetrofitProdactClient.class);
//    /getAds?id=236&password=OVUJ1DJN&siteId=10777&deviceId=4230&sessionId=techtestsession&totalCampaignsRequested=10


        Call<Ads> call = service.getProdact(/*"236","OVUJ1DJN","10777","4230",
                "techtestsession","10","yaish"*/);
        call.enqueue(new Callback<Ads>() {
            @Override
            public void onResponse(Call<Ads> call, Response<Ads> response) {
                Toast.makeText(MainActivity.this,response.toString(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<Ads> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.toString(),Toast.LENGTH_LONG).show();

            }

    });

    }
    public void sendMasseg(int productId){
        Fragment showItemF;
        Bundle bundle = new Bundle();
        bundle.putInt("productId",productId);
        FragmentManager fm = getSupportFragmentManager();
        showItemF = fm.findFragmentByTag("ShowItem");

        if(showItemF!=null){
            showItemF.setArguments(bundle);
        }else {
            showItemF = new ShowItem();
            showItemF.setArguments(bundle);
        }
        fm.beginTransaction()
                .replace(findViewById(R.id.fragmentContainer).getId(),showItemF,"ShowItem")
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onItemClick(int itemId) {
        sendMasseg(itemId);
    }
}
