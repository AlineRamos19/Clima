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
    private String mDataClima;

    @SerializedName("pt")
    private String mDescricao;

    @SerializedName("min")
    private int mTempoMin;

    @SerializedName("max")
    private int mTempoMax;

    @SerializedName("day")
    private int mIconeDia;

    private ImageView mImageClima;


    public String getmNomeCidade() {
        return mNomeCidade;
    }

    public void setmNomeCidade(String mNomeCidade) {
        this.mNomeCidade = mNomeCidade;
    }

    public String getmDataClima() {
        return mDataClima;
    }

    public void setmDataClima(String mDataClima) {
        this.mDataClima = mDataClima;
    }

    public String getmDescricao() {
        return mDescricao;
    }

    public void setmDescricao(String mDescricao) {
        this.mDescricao = mDescricao;
    }

    public int getmTempoMin() {
        return mTempoMin;
    }

    public void setmTempoMin(int mTempoMin) {
        this.mTempoMin = mTempoMin;
    }

    public int getmTempoMax() {
        return mTempoMax;
    }

    public void setmTempoMax(int mTempoMax) {
        this.mTempoMax = mTempoMax;
    }

    public int getmIconeDia() {
        return mIconeDia;
    }

    public void setmIconeDia(int mIconeDia) {
        this.mIconeDia = mIconeDia;
    }

    public ImageView getmImageClima() {
        return mImageClima;
    }

    public void setmImageClima(ImageView mImageClima) {
        this.mImageClima = mImageClima;
    }
}
