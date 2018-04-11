
package com.example.t100.clima.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Temperature {

    @SerializedName("min")
    @Expose
    private int min;
    @SerializedName("max")
    @Expose
    private int max;
    @SerializedName("morning")
    @Expose
    private Morning morning;
    @SerializedName("afternoon")
    @Expose
    private Afternoon afternoon;
    @SerializedName("night")
    @Expose
    private Night night;

    public int getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Morning getMorning() {
        return morning;
    }

    public void setMorning(Morning morning) {
        this.morning = morning;
    }

    public Afternoon getAfternoon() {
        return afternoon;
    }

    public void setAfternoon(Afternoon afternoon) {
        this.afternoon = afternoon;
    }

    public Night getNight() {
        return night;
    }

    public void setNight(Night night) {
        this.night = night;
    }

}
