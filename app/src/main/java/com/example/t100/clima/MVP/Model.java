package com.example.t100.clima.MVP;


import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.Toast;

import com.example.t100.clima.modelo.Clima;
import com.example.t100.clima.network.RetrofitConfig;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Model implements MVP.ModelImpl {

    private static final String LOG_TAG = Model.class.getSimpleName();
    private List<Clima> listaClima = new ArrayList<>();
    private MVP.PresenterImpl presenter;

    public Model(MVP.PresenterImpl presenter) {
        this.presenter = presenter;
    }

    @Override
    public void callRetrofit(int id) {

        try {
            Call<List<Clima>>call = new RetrofitConfig().getRetrofitService().buscarClima(id);

            call.enqueue(new Callback <List<Clima>>() {
                @Override
                public void onResponse(@NonNull Call<List<Clima>> call, @NonNull Response<List<Clima>> response) {
                    listaClima = response.body();
                    presenter.updateListarRecycler(listaClima);
                }

                @Override
                public void onFailure(@NonNull Call<List<Clima>> call, @NonNull Throwable t) {
                    Log.e(LOG_TAG, "Error: " + t.getMessage());
                }
            });
        } catch (Exception e) {
            Log.e(LOG_TAG, "Error: " + e.getMessage());
        }

    }
}
