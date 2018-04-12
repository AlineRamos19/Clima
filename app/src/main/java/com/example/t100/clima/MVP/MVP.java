package com.example.t100.clima.MVP;

import android.content.Context;

import com.example.t100.clima.modelo.Clima;
import com.example.t100.clima.modelo.Datum;

import java.util.ArrayList;
import java.util.List;

public interface MVP {

    interface ViewImpl {
        public void showProgressBar(int visibilidade);

        public void updateListaRecycler();

    }

    interface PresenterImpl {
        public void retrofitService(int id);

        public void updateListarRecycler(List<Datum> listaClima);

        public List<Datum> getClima();

        public void setView(MVP.ViewImpl view);

        public void showProgressBar(boolean status);

    }

    interface ModelImpl {
        void callRetrofit(int id);
    }


}

