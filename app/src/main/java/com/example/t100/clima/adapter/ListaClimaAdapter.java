package com.example.t100.clima.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.t100.clima.R;
import com.example.t100.clima.modelo.Clima;

import java.util.ArrayList;

/**
 * Created by t100 on 06/04/2018.
 */

public class ListaClimaAdapter extends RecyclerView.Adapter<ListaClimaAdapter.ClimaHolder> {

    private ArrayList<Clima> listaClima;
    private Context context;

    public ListaClimaAdapter(ArrayList<Clima> listaClima, Context context) {
        this.listaClima = listaClima;
        this.context = context;
    }


    @Override
    public ClimaHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_lista_clima, parent, false);
        return new ClimaHolder(view);
    }

    @Override
    public void onBindViewHolder(ClimaHolder holder, int position) {

        Clima itemClima = listaClima.get(position);

        holder.mNomeCidade.setText(itemClima.getmNomeCidade());
        holder.mDescricao.setText(itemClima.getmDescricao());
        holder.mDataClima.setText(itemClima.getmDataClima());
        holder.mTempoMin.setText(itemClima.getmTempoMin());
        holder.mTempoMax.setText(itemClima.getmTempoMax());

        switch (itemClima.getmIconeDia()){
            case 1 :
                holder.mImagemClima.setImageDrawable(R.drawable.sol);


        }

    }

    @Override
    public int getItemCount() {
        return listaClima != null ? listaClima.size() : 0 ;
    }

    class ClimaHolder extends RecyclerView.ViewHolder{

        private TextView mNomeCidade;
        private TextView mDataClima;
        private TextView mDescricao;
        private TextView mTempoMin;
        private TextView mTempoMax;
        private ImageView mImagemClima;

        private ClimaHolder(View itemView) {
            super(itemView);

            mNomeCidade = itemView.findViewById(R.id.nome_cidade);
            mDataClima = itemView.findViewById(R.id.txt_data);
            mDescricao = itemView.findViewById(R.id.desc_clima);
            mTempoMin = itemView.findViewById(R.id.temp_minima);
            mTempoMax = itemView.findViewById(R.id.temp_maxima);
            mImagemClima = itemView.findViewById(R.id.icone_clima);
        }


    }
}
