package com.example.t100.clima.MVP;

import android.content.Context;

import com.example.t100.clima.modelo.Clima;

import java.util.ArrayList;
import java.util.List;

public interface MVP {

    interface ViewImpl {
        public void showProgressBar(int visibilidade);

        public void showSnack(String msg);

        public void updateListaRecycler();

    }

    interface PresenterImpl {
        public void retrofitService(int id);

        public void updateListarRecycler(List<Clima> listaClima);

        public List<Clima> getClima();

        public Context getContext();

        public void setView(MVP.ViewImpl view);

        public void showProgressBar(boolean status);

        public void showSnackBar(String msg);
    }

    interface ModelImpl {
        List<Clima> callRetrofit(int id);
    }


}

