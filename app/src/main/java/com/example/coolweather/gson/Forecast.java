package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Create by ${郑建华}
 * on 2020年8月20日23:57:55
 */
public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public  More more;

    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
