package com.coolweather.android.util;

import android.text.TextUtils;
import android.util.Log;

import com.coolweather.android.db.City;
import com.coolweather.android.db.County;
import com.coolweather.android.db.Province;
import com.coolweather.android.gson.Weather;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by pc on 2018/1/20.
 */

public class Utility {

    private static final String TAG = "Utility";

    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allProvinces = new JSONArray(response);
                for(int i=0;i<allProvinces.length();i++){
                    JSONObject provinceObj = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObj.getString("name"));
                    province.setProvinceCode(provinceObj.getInt("id"));
                    province.save();
                }
                return true;
            }catch(JSONException e){
                Log.i(TAG, "解析省份数据时出现错误", e);
            }
        }
        return false;
    }

    public static boolean handleCityResponse(String response,int provinceId){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allCities = new JSONArray(response);
                for(int i=0;i<allCities.length();i++){
                    JSONObject cityObj = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObj.getString("name"));
                    city.setCityCode(cityObj.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            }catch(JSONException e){
                Log.i(TAG, "解析城市数据时出现错误", e);
            }
        }
        return false;
    }

    public static boolean handleCountyResponse(String response,int cityId){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allCounties = new JSONArray(response);
                for(int i=0;i<allCounties.length();i++){
                    JSONObject countyObj = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObj.getString("name"));
                    county.setWeatherId(countyObj.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            }catch(JSONException e){
                Log.i(TAG, "解析区县数据时出现错误", e);
            }
        }
        return false;
    }

    public static boolean handleResponseData(String response,int parentId,Class clazz){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allData = new JSONArray(response);
                for(int i=0;i<allData.length();i++){
                    if(clazz == Province.class && parentId < 0){
                        JSONObject provinceObj = allData.getJSONObject(i);
                        Province province = new Province();
                        province.setProvinceName(provinceObj.getString("name"));
                        province.setProvinceCode(provinceObj.getInt("id"));
                        province.save();
                    }
                    if(clazz == City.class && parentId > 0){
                        JSONObject cityObj = allData.getJSONObject(i);
                        City city = new City();
                        city.setCityName(cityObj.getString("name"));
                        city.setCityCode(cityObj.getInt("id"));
                        city.setProvinceId(parentId);
                        city.save();
                    }
                    if(clazz == County.class && parentId > 0){
                        JSONObject countyObj = allData.getJSONObject(i);
                        County county = new County();
                        county.setCountyName(countyObj.getString("name"));
                        county.setWeatherId(countyObj.getString("weather_id"));
                        county.setCityId(parentId);
                        county.save();
                    }
                }
                return true;
            }catch(JSONException e){
                Log.i(TAG, "解析json数据时出现错误", e);
            }
        }
        return false;
    }

    public static Weather handleWeatherResponse(String response){

        try {
            JSONObject jsonObj = new JSONObject(response);
            JSONArray jsonArray = jsonObj.getJSONArray("HeWeather");
            String weatherContent = jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(weatherContent,Weather.class);
        }catch(JSONException e){
            Log.i(TAG,"解析天气数据时出现错误",e);
        }
        return null;
    }
}
