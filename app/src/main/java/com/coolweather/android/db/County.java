package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by pc on 2018/1/20.
 */

public class County extends DataSupport {

    private int id;
    // 区县名称
    private String countyName;
    // 区县代码
    private String weatherId;
    // 区县对应城市id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
