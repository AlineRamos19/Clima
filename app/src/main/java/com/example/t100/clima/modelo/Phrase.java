
package com.example.t100.clima.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Phrase {

    @SerializedName("reduced")
    @Expose
    private String reduced;
    @SerializedName("morning")
    @Expose
    private String morning;
    @SerializedName("afternoon")
    @Expose
    private String afternoon;
    @SerializedName("night")
    @Expose
    private String night;
    @SerializedName("dawn")
    @Expose
    private String dawn;

    public String getReduced() {
        return reduced;
    }

    public void setReduced(String reduced) {
        this.reduced = reduced;
    }

    public String getMorning() {
        return morning;
    }

    public void setMorning(String morning) {
        this.morning = morning;
    }

    public String getAfternoon() {
        return afternoon;
    }

    public void setAfternoon(String afternoon) {
        this.afternoon = afternoon;
    }

    public String getNight() {
        return night;
    }

    public void setNight(String night) {
        this.night = night;
    }

    public String getDawn() {
        return dawn;
    }

    public void setDawn(String dawn) {
        this.dawn = dawn;
    }

}
