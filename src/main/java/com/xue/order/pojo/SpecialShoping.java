package com.xue.order.pojo;

public class SpecialShoping {
    private String specialid;

    private String price;

    private String time;

    private String kindsid;

    private String remark;

    private Integer isuse;

    private Integer expire;

    private String userid;

    private String shopingname;

    private String id;

    private String kindsparentid;

    private String unit;

    private String shopingcode;

    private String volume;

    private String specifications;

    private String flavor;

    private String imgurl;

    private Integer originalprice;

    public String getSpecialid() {
        return specialid;
    }

    public void setSpecialid(String specialid) {
        this.specialid = specialid == null ? null : specialid.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getKindsid() {
        return kindsid;
    }

    public void setKindsid(String kindsid) {
        this.kindsid = kindsid == null ? null : kindsid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getIsuse() {
        return isuse;
    }

    public void setIsuse(Integer isuse) {
        this.isuse = isuse;
    }

    public Integer getExpire() {
        return expire;
    }

    public void setExpire(Integer expire) {
        this.expire = expire;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getShopingname() {
        return shopingname;
    }

    public void setShopingname(String shopingname) {
        this.shopingname = shopingname == null ? null : shopingname.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getKindsparentid() {
        return kindsparentid;
    }

    public void setKindsparentid(String kindsparentid) {
        this.kindsparentid = kindsparentid == null ? null : kindsparentid.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getShopingcode() {
        return shopingcode;
    }

    public void setShopingcode(String shopingcode) {
        this.shopingcode = shopingcode == null ? null : shopingcode.trim();
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume == null ? null : volume.trim();
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor == null ? null : flavor.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public Integer getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(Integer originalprice) {
        this.originalprice = originalprice;
    }
}