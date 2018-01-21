package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {

    @SerializedName("air")
    public Air air;
    @SerializedName("comf")
    public Comf comf;
    @SerializedName("cw")
    public Cw cw;
    @SerializedName("drsg")
    public Drsg drsg;
    @SerializedName("flu")
    public Flu flu;
    @SerializedName("sport")
    public Sport sport;
    @SerializedName("trav")
    public Trav trav;
    @SerializedName("uv")
    public Uv uv;

    public class BasicSuggestion{
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String txt;
    }

    public class Air extends BasicSuggestion{}

    public class Comf extends BasicSuggestion{}

    public class Cw extends BasicSuggestion{}

    public class Drsg extends BasicSuggestion{}

    public class Flu extends BasicSuggestion{}

    public class Sport extends BasicSuggestion{}

    public class Trav extends BasicSuggestion{}

    public class Uv extends BasicSuggestion{}

}
