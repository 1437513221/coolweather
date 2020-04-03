package com.coolweather.android.gson;

/**
 * Created by ThinkPad E450 on 2020/4/1.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
