package com.example.t100.clima.MVP;

import android.content.Context;

import com.example.t100.clima.modelo.Clima;

import java.util.ArrayList;
import java.util.List;

public interface MVP {

    interface ViewImpl {
        public void showProgressBar(int visibilidade);
        public void updateListaRecycler();

    }

    interface PresenterImpl {
        public void retrofitService(int id);

        public void updateListarRecycler(Clima listaClima);

        public List<Clima> getClima();

        public void setView(MVP.ViewImpl view);

        public void showProgressBar(boolean status);

    }

    interface ModelImpl {
        void callRetrofit(int id);
    }


}

