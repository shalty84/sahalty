package com.shalty.technicaltestdigitalturbine.Util;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.FrameLayout;

import com.shalty.technicaltestdigitalturbine.fragment.HomeScreen;

public class AppData {

    public static void addOrReplaceFragment(FrameLayout container, Fragment newFragment, AppCompatActivity activity){

        FragmentManager fm = activity.getSupportFragmentManager();
        if(fm.findFragmentByTag("homScreen")!=null){
            fm.beginTransaction()
                    .replace(container.getId(),newFragment)
                    .addToBackStack("")
                    .commit();
            Log.d("fbadd", "addOrReplaceFragment: !=null");

        }else {
            fm.beginTransaction()
                    .add(container.getId(),newFragment)
                    .addToBackStack("homScreen")
                    .commit();
            Log.d("fbadd", "addOrReplaceFragment: ==null");

        }
    }



}
