package com.example.t100.clima.MVP;

import android.content.Context;
import android.util.Log;
import android.view.View;

import com.example.t100.clima.modelo.Clima;
import com.example.t100.clima.modelo.Datum;

import java.util.ArrayList;
import java.util.List;


public class Presenter implements MVP.PresenterImpl {

    private List<Datum> listagem = new ArrayList<>();
    private MVP.ViewImpl view ;

    private MVP.ModelImpl model;

    public Presenter() {
        model = new Model(this);
    }

    @Override
    public void retrofitService(int id) {
        model.callRetrofit(id);
    }


    @Override
    public List<Datum> getClima() {
        return listagem;
    }

    @Override
    public void setView(MVP.ViewImpl view) {
        this.view = view;
    }

    @Override
    public void showProgressBar(boolean status) {
        int visibilidadde = status ? View.VISIBLE : View.INVISIBLE;
        view.showProgressBar(visibilidadde);
    }

    @Override
    public void updateListarRecycler(List<Datum> datum) {
        listagem.clear();
        listagem.addAll(datum);
        view.updateListaRecycler();
    }
}
