package com.example.t100.clima.activity;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.t100.clima.MVP.Presenter;
import com.example.t100.clima.R;

public class MainActivity extends AppCompatActivity  {

    Presenter presenter = new Presenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String cidade ;
                cidade = spinner.getSelectedItem().toString();
                if(cidade.equals("São Paulo")){
                    presenter.retrofitService(3477);

                } else if (cidade.equals("Suzano")){
                    presenter.retrofitService(3501);
                }

                Intent intent = new Intent(MainActivity.this, ListaClima.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Clicado: " + cidade, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }

}
