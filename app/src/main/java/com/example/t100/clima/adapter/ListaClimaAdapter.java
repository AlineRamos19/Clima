package com.example.t100.clima.adapter;

import android.annotation.SuppressLint;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.t100.clima.R;
import com.example.t100.clima.activity.ListaClima;
import com.example.t100.clima.modelo.Datum;

import java.util.List;

public class ListaClimaAdapter extends RecyclerView.Adapter<ListaClimaAdapter.ClimaHolder> {

    private List<Datum> listaClima;
    private ListaClima context;

    public ListaClimaAdapter(List<Datum> listaClima, ListaClima context) {
        this.listaClima = listaClima;
        this.context = context;
    }

    @Override
    public ClimaHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_lista_clima, parent,
                false);
        return new ClimaHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(ClimaHolder holder, int position) {

            Datum datum = listaClima.get(position);

            holder.mDescricao.setText(datum.getTextIcon().getText().getPt());
            holder.mDataClima.setText(datum.getDateBr());
            holder.mTempoMin.setText(String.valueOf(datum.getTemperature().getMin()));
            holder.mTempoMin.append("º");
            holder.mTempoMax.setText(String.valueOf(datum.getTemperature().getMax()));
            holder.mTempoMax.append("º");

            switch (datum.getTextIcon().getIcon().getDay()) {
                case "1":
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.sol));
                    break;

                case "2":
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.solcomnuvem));
                    break;

                case "2r":
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.solmuitanuvem));
                    break;


                case "3":
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.chuvafraca));
                    break;

                case "3n":
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.chuvafraca));
                    break;

                case "3TM":
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.chuvafraca));
                    break;

                case "4":
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.solchuva));
                    break;

                case "4r":
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.solmuitachuva));
                    break;

                case "4t":
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.solchuvaraio));
                    break;

                case "5":
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.tempestade));
                    break;

                case "5n":
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.tempestade));
                    break;

                case "6":
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.tempestaderaio));
                    break;

                case "6n":
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.tempestaderaio));
                    break;

                case "7":
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.orvalho));
                    break;

                case "7n":
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.orvalho));
                    break;

                case "8":
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.granizo));
                    break;

                case "9":
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.solpoucanuvem));
                    break;
                default:
                    holder.mImagemClima.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.placeholder_image));


        }

    }

    @Override
    public int getItemCount() {
        return listaClima != null ? listaClima.size() : 0;
    }

    class ClimaHolder extends RecyclerView.ViewHolder {


        private TextView mDataClima;
        private TextView mDescricao;
        private TextView mTempoMin;
        private TextView mTempoMax;
        private ImageView mImagemClima;

        private ClimaHolder(View itemView) {
            super(itemView);

            mDataClima = itemView.findViewById(R.id.txt_data);
            mDescricao = itemView.findViewById(R.id.desc_clima);
            mTempoMin = itemView.findViewById(R.id.temp_minima);
            mTempoMax = itemView.findViewById(R.id.temp_maxima);
            mImagemClima = itemView.findViewById(R.id.icone_clima);
        }


    }
}
