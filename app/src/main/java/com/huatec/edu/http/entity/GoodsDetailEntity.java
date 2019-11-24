package com.huatec.edu.http.entity;

import java.io.Serializable;
import java.util.List;

public class GoodsDetailEntity implements Serializable{
    private int goods_id;
    private String name;
    private String sn;
    private String brief;
    private String description;
    private double price;
    private String cost;
    private double mktprice;
    private int mkt_enable;
    private String cat_id;
    private String brand_id;
    private int weight;
    private String intro;
    private String params;
    private long creatime;
    private long last_modify;
    private int view_count;
    private int buy_count;
    private String thumbnail;
    private String big;
    private String small;
    private String original;
    private BriefGoodsCat1Bean briefGoodsCat1;
    private BriefGoodsCat2Bean briefGoodsCat2;
    private BriefBrandBean briefBrand;
    private GoodStoreBean goodStore;
    private List<GisBean> gis;

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

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public double getMktprice() {
        return mktprice;
    }

    public void setMktprice(double mktprice) {
        this.mktprice = mktprice;
    }

    public int getMkt_enable() {
        return mkt_enable;
    }

    public void setMkt_enable(int mkt_enable) {
        this.mkt_enable = mkt_enable;
    }

    public String getCat_id() {
        return cat_id;
    }

    public void setCat_id(String cat_id) {
        this.cat_id = cat_id;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public long getCreatime() {
        return creatime;
    }

    public void setCreatime(long creatime) {
        this.creatime = creatime;
    }

    public long getLast_modify() {
        return last_modify;
    }

    public void setLast_modify(long last_modify) {
        this.last_modify = last_modify;
    }

    public int getView_count() {
        return view_count;
    }

    public void setView_count(int view_count) {
        this.view_count = view_count;
    }

    public int getBuy_count() {
        return buy_count;
    }

    public void setBuy_count(int buy_count) {
        this.buy_count = buy_count;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getBig() {
        return big;
    }

    public void setBig(String big) {
        this.big = big;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public BriefGoodsCat1Bean getBriefGoodsCat1() {
        return briefGoodsCat1;
    }

    public void setBriefGoodsCat1(BriefGoodsCat1Bean briefGoodsCat1) {
        this.briefGoodsCat1 = briefGoodsCat1;
    }

    public BriefGoodsCat2Bean getBriefGoodsCat2() {
        return briefGoodsCat2;
    }

    public void setBriefGoodsCat2(BriefGoodsCat2Bean briefGoodsCat2) {
        this.briefGoodsCat2 = briefGoodsCat2;
    }

    public BriefBrandBean getBriefBrand() {
        return briefBrand;
    }

    public void setBriefBrand(BriefBrandBean briefBrand) {
        this.briefBrand = briefBrand;
    }

    public GoodStoreBean getGoodStore() {
        return goodStore;
    }

    public void setGoodStore(GoodStoreBean goodStore) {
        this.goodStore = goodStore;
    }

    public List<GisBean> getGis() {
        return gis;
    }

    public void setGis(List<GisBean> gis) {
        this.gis = gis;
    }

    public static class BriefGoodsCat1Bean {
        private int cat_id;
        private String name;

        public int getCat_id() {
            return cat_id;
        }

        public void setCat_id(int cat_id) {
            this.cat_id = cat_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class BriefGoodsCat2Bean {
        private int cat_id;
        private String name;

        public int getCat_id() {
            return cat_id;
        }

        public void setCat_id(int cat_id) {
            this.cat_id = cat_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class BriefBrandBean {
        private int brand_id;
        private String name;
        private String logo;

        public int getBrand_id() {
            return brand_id;
        }

        public void setBrand_id(int brand_id) {
            this.brand_id = brand_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }
    }

    public static class GoodStoreBean {
        private int store_id;
        private String goods_id;
        private int store;
        private int enable_store;
        private String operate_type;
        private String intime;
        private String outime;
        private String briefGoods;

        public int getStore_id() {
            return store_id;
        }

        public void setStore_id(int store_id) {
            this.store_id = store_id;
        }

        public String getGoods_id() {
            return goods_id;
        }

        public void setGoods_id(String goods_id) {
            this.goods_id = goods_id;
        }

        public int getStore() {
            return store;
        }

        public void setStore(int store) {
            this.store = store;
        }

        public int getEnable_store() {
            return enable_store;
        }

        public void setEnable_store(int enable_store) {
            this.enable_store = enable_store;
        }

        public String getOperate_type() {
            return operate_type;
        }

        public void setOperate_type(String operate_type) {
            this.operate_type = operate_type;
        }

        public String getIntime() {
            return intime;
        }

        public void setIntime(String intime) {
            this.intime = intime;
        }

        public String getOutime() {
            return outime;
        }

        public void setOutime(String outime) {
            this.outime = outime;
        }

        public String getBriefGoods() {
            return briefGoods;
        }

        public void setBriefGoods(String briefGoods) {
            this.briefGoods = briefGoods;
        }
    }

    public static class GisBean {
        private int img_id;
        private int goods_id;
        private String thumbnail;
        private String big;
        private String small;
        private String original;
        private int isdefault;
        private String creatime;
        private String modifytime;

        public int getImg_id() {
            return img_id;
        }

        public void setImg_id(int img_id) {
            this.img_id = img_id;
        }

        public int getGoods_id() {
            return goods_id;
        }

        public void setGoods_id(int goods_id) {
            this.goods_id = goods_id;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getBig() {
            return big;
        }

        public void setBig(String big) {
            this.big = big;
        }

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getOriginal() {
            return original;
        }

        public void setOriginal(String original) {
            this.original = original;
        }

        public int getIsdefault() {
            return isdefault;
        }

        public void setIsdefault(int isdefault) {
            this.isdefault = isdefault;
        }

        public String getCreatime() {
            return creatime;
        }

        public void setCreatime(String creatime) {
            this.creatime = creatime;
        }

        public String getModifytime() {
            return modifytime;
        }

        public void setModifytime(String modifytime) {
            this.modifytime = modifytime;
        }
    }


}
