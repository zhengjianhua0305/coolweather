package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Create by ${郑建华}
 * on 2020年8月20日23:48:35
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
