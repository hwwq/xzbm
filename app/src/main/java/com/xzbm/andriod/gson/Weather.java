package com.xzbm.andriod.gson;

import com.google.gson.annotations.SerializedName;
import com.xzbm.andriod.db.Province;

import java.security.PublicKey;
import java.util.List;

/**
 * Created by sss55 on 2017/11/19.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast>forecastList;
}
