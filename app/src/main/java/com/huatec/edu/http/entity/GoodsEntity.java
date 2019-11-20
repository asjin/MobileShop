package com.huatec.edu.http.entity;

import java.io.Serializable;

public class GoodsEntity implements Serializable {
    private int goods_id;//id
    private String name;//商品名称
    private double price;//价格
    private String mktprice;//市场价
    private String small;//小图
    private int mkt_enable;//0上架，1下架
    private String briefGoodsCat;//商品描述
    private String briefBrand;//商品品牌

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMktprice() {
        return mktprice;
    }

    public void setMktprice(String mktprice) {
        this.mktprice = mktprice;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public int getMkt_enable() {
        return mkt_enable;
    }

    public void setMkt_enable(int mkt_enable) {
        this.mkt_enable = mkt_enable;
    }

    public String getBriefGoodsCat() {
        return briefGoodsCat;
    }

    public void setBriefGoodsCat(String briefGoodsCat) {
        this.briefGoodsCat = briefGoodsCat;
    }

    public String getBriefBrand() {
        return briefBrand;
    }

    public void setBriefBrand(String briefBrand) {
        this.briefBrand = briefBrand;
    }
}
