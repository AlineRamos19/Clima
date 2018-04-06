package com.example.t100.clima.network;

import com.example.t100.clima.activity.MVP;
import com.example.t100.clima.modelo.Clima;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;



public class RetrofitConfig implements MVP.ModelRest {

    public static final String BASE_URL = "http://apiadvisor.climatempo.com.br/api/v1/forecast/locale/";

    private static Retrofit retrofit = null;
    @Override
    public void pedidoRetrofit() {
        if(retrofit == null){

            retrofit = new Retrofit.Builder().
                    baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
    }

    public ClimaService getRetrofitService(){
        return retrofit.create(ClimaService.class);
    }

    public interface ClimaService{

        @GET("/days/15? 83973d4299b9d9091fe6c292071467b7")
        Call<Clima> buscarClima(@Query("id") int id);
    }



}
