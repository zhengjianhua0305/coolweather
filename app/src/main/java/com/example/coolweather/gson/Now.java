package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Create by ${郑建华}
 * on 2020年8月20日23:52:39
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
