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
            Call<Clima> call = new RetrofitConfig().getRetrofitService().buscarClima(id);

            call.enqueue(new Callback<Clima>() {
                @Override
                public void onResponse(@NonNull Call<Clima> call, @NonNull Response<Clima> response) {
                    Log.e("Model", response.toString());
                    Clima clima = response.body();
                    listaClima.add(clima);
                    presenter.updateListarRecycler(listaClima);
                }

                @Override
                public void onFailure(@NonNull Call<Clima> call, @NonNull Throwable t) {
                    Log.e(LOG_TAG, "Error: " + t.getMessage());
                }
            });
        } catch (Exception e) {
            Log.e(LOG_TAG, "Error: " + e.getMessage());
        }
    }
}
