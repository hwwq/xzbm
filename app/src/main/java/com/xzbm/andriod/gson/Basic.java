package com.xzbm.andriod.gson;

import android.text.style.UpdateAppearance;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sss55 on 2017/11/19.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public  String updateTime;
        
    }
}
