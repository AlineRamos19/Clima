package com.example.t100.clima.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.t100.clima.MVP.Presenter;
import com.example.t100.clima.R;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnTouchListener {

    Presenter presenter = new Presenter();
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    boolean userSelect = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (presenter == null) {
            presenter = new Presenter();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        final Spinner spinner = findViewById(R.id.spinner);

        spinner.setOnTouchListener(this);
        spinner.setOnItemSelectedListener(this);
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        userSelect = true;
        return false;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if (userSelect) {
            Object item = adapterView.getItemAtPosition(i);

            if (item.toString().equals(getString(R.string.cidade_sao_paulo))) {
                presenter.retrofitService(3477);
                Intent intent = new Intent(MainActivity.this, ListaClima.class);
                startActivity(intent);

            } else if (item.toString().equals(getString(R.string.cidade_suzano))) {
                presenter.retrofitService(3501);
                Intent intent = new Intent(MainActivity.this, ListaClima.class);
                startActivity(intent);
            } else if (item.toString().equals(getString(R.string.label_selecione))) {
                Snackbar.make(view, R.string.label_selecione_spinner, Snackbar.LENGTH_SHORT).show();
            }
            userSelect = false;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
