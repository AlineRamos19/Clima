package com.example.t100.clima.modelo;

import android.widget.ImageView;

import com.google.gson.annotations.SerializedName;

/**
 * Created by t100 on 06/04/2018.
 */

public class Clima {

    @SerializedName("name")
    private String mNomeCidade;

    @SerializedName("date_br")
    private Datum mDataClima;

    @SerializedName("pt")
    private Text mDescricao;

    @SerializedName("min")
    private Temperature mTempoMin;

    @SerializedName("max")
    private Temperature mTempoMax;

    @SerializedName("day")
    private Icon mIconeDia;

    private ImageView mImageClima;


    public String getmNomeCidade() {
        return mNomeCidade;
    }

    public void setmNomeCidade(String mNomeCidade) {
        this.mNomeCidade = mNomeCidade;
    }

    public Datum getmDataClima() {
        return mDataClima;
    }

    public void setmDataClima(Datum mDataClima) {
        this.mDataClima = mDataClima;
    }

    public Text getmDescricao() {
        return mDescricao;
    }

    public void setmDescricao(Text mDescricao) {
        this.mDescricao = mDescricao;
    }

    public Temperature getmTempoMin() {
        return mTempoMin;
    }

    public void setmTempoMin(Temperature mTempoMin) {
        this.mTempoMin = mTempoMin;
    }

    public Temperature getmTempoMax() {
        return mTempoMax;
    }

    public void setmTempoMax(Temperature mTempoMax) {
        this.mTempoMax = mTempoMax;
    }

    public Icon getmIconeDia() {
        return mIconeDia;
    }

    public void setmIconeDia(Icon mIconeDia) {
        this.mIconeDia = mIconeDia;
    }

    public ImageView getmImageClima() {
        return mImageClima;
    }

    public void setmImageClima(ImageView mImageClima) {
        this.mImageClima = mImageClima;
    }
}
