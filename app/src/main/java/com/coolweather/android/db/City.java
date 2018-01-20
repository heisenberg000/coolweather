package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by pc on 2018/1/20.
 */

public class City extends DataSupport{

    private int id;
    // 城市名称
    private String cityName;
    // 城市代码
    private String cityCode;
    // 城市对应省份id
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
