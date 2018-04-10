package com.example.t100.clima.activity;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;

import com.example.t100.clima.MVP.MVP;
import com.example.t100.clima.MVP.Presenter;
import com.example.t100.clima.R;
import com.example.t100.clima.adapter.ListaClimaAdapter;
import com.example.t100.clima.modelo.Clima;

import java.util.ArrayList;
import java.util.List;

public class ListaClima extends AppCompatActivity implements MVP.ViewImpl {
    Presenter presenter = new Presenter();


    RecyclerView recyclerView;
    ListaClimaAdapter adapter;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_clima);

        if (savedInstanceState == null) {
            if (presenter == null) {
                presenter = new Presenter();
            }
        }
        presenter.setView(this);
    }

    @Override
    protected void onStart() {

        progressBar = findViewById(R.id.progress);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new ListaClimaAdapter(presenter.getClima(), ListaClima.this);
        updateListaRecycler();
        recyclerView.setAdapter(adapter);

        super.onStart();
    }

    @Override
    public void showProgressBar(int visibilidade) {
        progressBar.setVisibility(visibilidade);
    }

    @Override
    public void showSnack(String msg) {

    }

    @Override
    public void updateListaRecycler() {
        adapter.notifyDataSetChanged();
    }
}
