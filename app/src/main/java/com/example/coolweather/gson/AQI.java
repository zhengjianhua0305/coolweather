package com.example.coolweather.gson;

/**
 * Create by ${郑建华}
 * on 2020年8月20日23:51:10
 */
public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
