package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pc on 2018/1/21.
 */

public class Forecast {

    @SerializedName("astro")
    public Astro astro;
    @SerializedName("cond")
    public Cond cond;
    @SerializedName("date")
    public String date;
    @SerializedName("hum")
    public String hum;
    @SerializedName("pcpn")
    public String pcpn;
    @SerializedName("pop")
    public String pop;
    @SerializedName("pres")
    public String pres;
    @SerializedName("tmp")
    public Tmp tmp;
    @SerializedName("uv")
    public String uv;
    @SerializedName("vis")
    public String vis;
    @SerializedName("wind")
    public Wind wind;

    public class Astro{
        @SerializedName("mr")
        public String mr;
        @SerializedName("ms")
        public String ms;
        @SerializedName("sr")
        public String sr;
        @SerializedName("ss")
        public String ss;
    }

    public class Cond{
        @SerializedName("code_d")
        public String code_d;
        @SerializedName("code_n")
        public String code_n;
        @SerializedName("txt_d")
        public String txt_d;
        @SerializedName("txt_n")
        public String txt_n;
    }

    public class Tmp{
        @SerializedName("max")
        public String max;
        @SerializedName("min")
        public String min;
    }

    public class Wind{
        @SerializedName("deg")
        public String deg;
        @SerializedName("dir")
        public String dir;
        @SerializedName("sc")
        public String sc;
        @SerializedName("spd")
        public String spd;
    }
}
