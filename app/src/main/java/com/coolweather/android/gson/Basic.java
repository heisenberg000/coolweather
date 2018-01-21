package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pc on 2018/1/21.
 */

public class Basic {
    // 地名
    @SerializedName("city")
    public String cityName;
    // 天气id
    @SerializedName("id")
    public String weatherId;
    // 国家名
    @SerializedName("cnty")
    public String cntyName;
    // 纬度
    @SerializedName("lat")
    public String latitude;
    // 经度
    @SerializedName("lon")
    public String longitude;
    @SerializedName("update")
    public Update update;

    public class Update{
        // 最近更新当地时间
        @SerializedName("loc")
        public String updateTime;
        // 最近更新时间对应的标准时间
        @SerializedName("utc")
        public String updateUtcTime;
    }
}
