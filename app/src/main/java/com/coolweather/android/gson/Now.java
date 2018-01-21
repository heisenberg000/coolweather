package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("cond")
    public Cond cond;

    public class Cond{
        @SerializedName("code")
        public String code;
        @SerializedName("txt")
        public String txt;
    }
    @SerializedName("fl")
    public String fl;
    @SerializedName("hum")
    public String hum;
    @SerializedName("pcpn")
    public String pcpn;
    @SerializedName("pres")
    public String pres;
    @SerializedName("tmp")
    public String tmp;
    @SerializedName("vis")
    public String vis;
    @SerializedName("wind")
    public Wind wind;

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
