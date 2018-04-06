package com.example.t100.clima.activity;

import com.example.t100.clima.modelo.Clima;

import java.util.ArrayList;

public interface MVP {
    interface ViewMain{
        public void showProgressBar(boolean status);
        public void showSnack(String msg);
    }

    interface PresenterLista{
        String CLIMA_ITEM = "clima";
        public String retrofitService(String escolhaUsuario);
        public  void updateListarRecycler(ArrayList<Clima> listaClima);
        public ArrayList<Clima> getClima();
    }

    interface ModelRest{
        public void pedidoRetrofit();
    }
}
