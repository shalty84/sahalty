package com.shalty.technicaltestdigitalturbine.Util;

import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class RetrofitClientInstance {
    private static Retrofit retrofit;
    private static final String API_BASE_URL = "http://ads.appia.com/";

    public static Retrofit getRetrofitInstance() {

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(API_BASE_URL)
//                .client(new OkHttpClient())
//                .addConverterFactory(SimpleXmlConverterFactory.create())
//                .build();


        if (retrofit == null) {

            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .client(new OkHttpClient())
                    .addConverterFactory(SimpleXmlConverterFactory.create())
                    .build();

        }
        return retrofit;
    }
}
