
package com.example.t100.clima.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_br")
    @Expose
    private String dateBr;
    @SerializedName("humidity")
    @Expose
    private Humidity humidity;
    @SerializedName("rain")
    @Expose
    private Rain rain;
    @SerializedName("wind")
    @Expose
    private Wind wind;
    @SerializedName("uv")
    @Expose
    private Uv uv;
    @SerializedName("thermal_sensation")
    @Expose
    private ThermalSensation thermalSensation;
    @SerializedName("text_icon")
    @Expose
    private TextIcon textIcon;
    @SerializedName("temperature")
    @Expose
    private Temperature temperature;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateBr() {
        return dateBr;
    }

    public void setDateBr(String dateBr) {
        this.dateBr = dateBr;
    }

    public Humidity getHumidity() {
        return humidity;
    }

    public void setHumidity(Humidity humidity) {
        this.humidity = humidity;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Uv getUv() {
        return uv;
    }

    public void setUv(Uv uv) {
        this.uv = uv;
    }

    public ThermalSensation getThermalSensation() {
        return thermalSensation;
    }

    public void setThermalSensation(ThermalSensation thermalSensation) {
        this.thermalSensation = thermalSensation;
    }

    public TextIcon getTextIcon() {
        return textIcon;
    }

    public void setTextIcon(TextIcon textIcon) {
        this.textIcon = textIcon;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

}
