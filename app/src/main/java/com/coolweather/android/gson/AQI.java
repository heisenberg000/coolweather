package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class AQI {

    @SerializedName("city")
    public AQICity city;

    public class AQICity{
        @SerializedName("aqi")
        public String aqi;
        @SerializedName("qlty")
        public String qlty;
        @SerializedName("pm25")
        public String pm25;
        @SerializedName("pm10")
        public String pm10;
        @SerializedName("no2")
        public String no2;
        @SerializedName("so2")
        public String so2;
        @SerializedName("co")
        public String co;
        @SerializedName("o3")
        public String o3;
    }


}
