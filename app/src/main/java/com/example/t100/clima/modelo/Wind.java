
package com.example.t100.clima.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wind {

    @SerializedName("velocity_min")
    @Expose
    private Integer velocityMin;
    @SerializedName("velocity_max")
    @Expose
    private Integer velocityMax;
    @SerializedName("velocity_avg")
    @Expose
    private Integer velocityAvg;
    @SerializedName("gust_max")
    @Expose
    private double gustMax;
    @SerializedName("direction_degrees")
    @Expose
    private Integer directionDegrees;
    @SerializedName("direction")
    @Expose
    private String direction;

    public Integer getVelocityMin() {
        return velocityMin;
    }

    public void setVelocityMin(Integer velocityMin) {
        this.velocityMin = velocityMin;
    }

    public Integer getVelocityMax() {
        return velocityMax;
    }

    public void setVelocityMax(Integer velocityMax) {
        this.velocityMax = velocityMax;
    }

    public Integer getVelocityAvg() {
        return velocityAvg;
    }

    public void setVelocityAvg(Integer velocityAvg) {
        this.velocityAvg = velocityAvg;
    }

    public double getGustMax() {
        return gustMax;
    }

    public void setGustMax(Integer gustMax) {
        this.gustMax = gustMax;
    }

    public Integer getDirectionDegrees() {
        return directionDegrees;
    }

    public void setDirectionDegrees(Integer directionDegrees) {
        this.directionDegrees = directionDegrees;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

}
