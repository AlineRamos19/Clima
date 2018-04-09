package com.example.t100.clima.MVP;

import android.content.Context;
import android.view.View;

import com.example.t100.clima.modelo.Clima;

import java.util.ArrayList;


public class Presenter implements MVP.PresenterImpl {

    private ArrayList<Clima> listagem = new ArrayList<>();
    private MVP.ViewImpl view;
    private MVP.ModelImpl model;

    public Presenter(){
        model = new Model();
    }
    @Override
    public void retrofitService(int id) {
        model.callRetrofit(id);
    }

    @Override
    public void updateListarRecycler(ArrayList<Clima> listaClima) {
        listagem.addAll(listaClima);

    }

    @Override
    public ArrayList<Clima> getClima() {
        return listagem;
    }

    @Override
    public Context getContext() {
        return (Context) view;
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
    public void showSnackBar(String msg) {
        view.showSnack(msg);
    }
}
