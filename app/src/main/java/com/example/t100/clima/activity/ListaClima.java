package com.example.t100.clima.activity;

import android.content.Intent;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.t100.clima.MVP.MVP;
import com.example.t100.clima.MVP.Presenter;
import com.example.t100.clima.R;
import com.example.t100.clima.adapter.ListaClimaAdapter;
import com.example.t100.clima.modelo.Clima;

import java.util.ArrayList;
import java.util.List;


public class ListaClima extends AppCompatActivity implements MVP.ViewImpl {

    Presenter presenter = new Presenter();

    ListaClimaAdapter adapter = null;
    ProgressBar progressBar;
    RecyclerView recyclerView;
    List<Clima> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_clima);

        if (presenter == null) {
            presenter = new Presenter();
        }
        presenter.setView(this);

        Intent intent = getIntent();
        int id = intent.getIntExtra("id", 0);
        presenter.retrofitService(id);
    }

    @Override
    protected void onStart() {
        super.onStart();


        progressBar = findViewById(R.id.progress);
        presenter.showProgressBar(true);

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        lista = presenter.getClima();

        if(lista.size() > 0 && presenter.getClima() != null){
            presenter.showProgressBar(false);
        }
        adapter = new ListaClimaAdapter(lista, this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void showProgressBar(int visibilidade) {
        progressBar.setVisibility(visibilidade);
    }

    @Override
    public void updateListaRecycler() {
        presenter.showProgressBar(false);
        adapter.notifyDataSetChanged();
    }

}
