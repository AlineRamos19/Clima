package com.example.t100.clima.network;

import com.example.t100.clima.modelo.Clima;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;



public interface ClimaService {

    @GET("/api/v1/forecast/locale/{id}/days/15?token=b81b67a0301c498b97f073d2ef26627a")
    Call <Clima> buscarClima(@Path("id") int id);
}
