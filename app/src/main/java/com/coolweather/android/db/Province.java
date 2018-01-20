package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by pc on 2018/1/20.
 */

public class Province extends DataSupport{
    // 每个实体类都有的字段
    private int id;
    // 省份名字
    private String provinceName;
    // 省份代码
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
