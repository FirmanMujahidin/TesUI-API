package com.joglo79.myapplication.Rest;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by firma on 18-Jan-18.
 */

public class ApiClient {

    public static ApiInterface initRetrofit(){

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(270, TimeUnit.SECONDS);
        builder.readTimeout(270, TimeUnit.SECONDS);

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = builder.build();

        Retrofit adapter_ = new Retrofit.Builder()
                .baseUrl("https://api.truvelmobile.com/parse/functions/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface adapter = adapter_.create(ApiInterface.class);
        return adapter;
    }
}
