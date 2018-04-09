package com.example.t100.clima.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitConfig  {

    private Retrofit retrofit = null;

    public RetrofitConfig() {

            this.retrofit = new Retrofit.Builder().
                    baseUrl("http://apiadvisor.climatempo.com.br/").
                    addConverterFactory(GsonConverterFactory.create())
                    .build();

    }

    public ClimaService getRetrofitService(){
        return this.retrofit.create(ClimaService.class);
    }

}
