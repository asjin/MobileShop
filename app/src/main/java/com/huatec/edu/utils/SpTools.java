package com.huatec.edu.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.huatec.edu.common.MobileShopApp;

public class SpTools {

    private static final String CONFIG_FILE_NAME = "mobileshop_config_file";

    /*
    * @param key 关键字
    * @param value 对应的值
    * */
    public static void putBoolean(String key,boolean value){
        SharedPreferences sp = MobileShopApp.getsContext().getSharedPreferences(CONFIG_FILE_NAME, Context.MODE_PRIVATE);
        sp.edit().putBoolean(key,value).commit();//提交保存键值对
    }

    /*
     * @param key 关键字
     * @param defValue 设置的默认值
     * */
    public static boolean getBoolean(String key,boolean defValue){
        SharedPreferences sp = MobileShopApp.getsContext().getSharedPreferences(CONFIG_FILE_NAME,Context.MODE_PRIVATE);
        return sp.getBoolean(key, defValue);
    }

    //value对应的值
    public static void putString(String key,String value){
        SharedPreferences sp = MobileShopApp.getsContext().getSharedPreferences(CONFIG_FILE_NAME,Context.MODE_PRIVATE);
        sp.edit().putString(key,value).commit();
    }

    /*
     * @param key 关键字
     * @param defValue 设置的默认值
     * */
    public static String getString(String key,String defValue){
        SharedPreferences sp = MobileShopApp.getsContext().getSharedPreferences(CONFIG_FILE_NAME,Context.MODE_PRIVATE);
        return sp.getString(key, defValue);
    }

    /*
     * @param key 关键字
     * @param value 对应的值
     * */
    public static void putInt(String key,int value){
        SharedPreferences sp = MobileShopApp.getsContext().getSharedPreferences(CONFIG_FILE_NAME, Context.MODE_PRIVATE);
        sp.edit().putInt(key,value).commit();//提交保存键值对
    }


}
