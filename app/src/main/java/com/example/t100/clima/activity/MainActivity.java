package com.example.t100.clima.activity;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.t100.clima.MVP.Presenter;
import com.example.t100.clima.R;

public class MainActivity extends AppCompatActivity {

    Presenter presenter = new Presenter();
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(presenter == null){
            presenter = new Presenter();        }


    }

    @Override
    protected void onStart() {
        super.onStart();

        final Spinner spinner = findViewById(R.id.spinner);
        spinner.setSelected(false);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Object item = adapterView.getItemAtPosition(i);

                if (item.toString().equals("São Paulo")) {
                    presenter.retrofitService(3477);
                    Intent intent = new Intent(MainActivity.this, ListaClima.class);
                    startActivity(intent);

                } else if (item.toString().equals("Suzano")) {
                    presenter.retrofitService(3501);
                    Intent intent = new Intent(MainActivity.this, ListaClima.class);
                    startActivity(intent);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
