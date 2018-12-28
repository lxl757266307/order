package com.xue.order.pojo;

import java.util.Date;

public class Kinds {
    private String id;

    private String shopingname;

    private String kindsparentid;

    private Integer priceinprovince;

    private Integer priceoutprovince;

    private String specifications;

    private String flavor;

    private String unit;

    private Integer isapplyaftersale;

    private Integer isspecialoffer;

    private Long shopingtotal;

    private String shopingnumber;

    private String imgurl;

    private String userid;

    private Integer isuse;

    private String remark;

    private String remark1;

    private String remark2;

    private Date createtime;

    private String shopingcode;

    private String volume;

    private String weight;

    private Integer isassumelogistics;

    private Integer isnew;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getShopingname() {
        return shopingname;
    }

    public void setShopingname(String shopingname) {
        this.shopingname = shopingname == null ? null : shopingname.trim();
    }

    public String getKindsparentid() {
        return kindsparentid;
    }

    public void setKindsparentid(String kindsparentid) {
        this.kindsparentid = kindsparentid == null ? null : kindsparentid.trim();
    }

    public Integer getPriceinprovince() {
        return priceinprovince;
    }

    public void setPriceinprovince(Integer priceinprovince) {
        this.priceinprovince = priceinprovince;
    }

    public Integer getPriceoutprovince() {
        return priceoutprovince;
    }

    public void setPriceoutprovince(Integer priceoutprovince) {
        this.priceoutprovince = priceoutprovince;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getIsapplyaftersale() {
        return isapplyaftersale;
    }

    public void setIsapplyaftersale(Integer isapplyaftersale) {
        this.isapplyaftersale = isapplyaftersale;
    }

    public Integer getIsspecialoffer() {
        return isspecialoffer;
    }

    public void setIsspecialoffer(Integer isspecialoffer) {
        this.isspecialoffer = isspecialoffer;
    }

    public Long getShopingtotal() {
        return shopingtotal;
    }

    public void setShopingtotal(Long shopingtotal) {
        this.shopingtotal = shopingtotal;
    }

    public String getShopingnumber() {
        return shopingnumber;
    }

    public void setShopingnumber(String shopingnumber) {
        this.shopingnumber = shopingnumber == null ? null : shopingnumber.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getIsuse() {
        return isuse;
    }

    public void setIsuse(Integer isuse) {
        this.isuse = isuse;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public Integer getIsassumelogistics() {
        return isassumelogistics;
    }

    public void setIsassumelogistics(Integer isassumelogistics) {
        this.isassumelogistics = isassumelogistics;
    }

    public Integer getIsnew() {
        return isnew;
    }

    public void setIsnew(Integer isnew) {
        this.isnew = isnew;
    }

    @Override
    public String toString() {
        return "Kinds{" +
                "id='" + id + '\'' +
                ", shopingname='" + shopingname + '\'' +
                ", kindsparentid='" + kindsparentid + '\'' +
                ", priceinprovince=" + priceinprovince +
                ", priceoutprovince=" + priceoutprovince +
                ", specifications='" + specifications + '\'' +
                ", flavor='" + flavor + '\'' +
                ", unit='" + unit + '\'' +
                ", isapplyaftersale=" + isapplyaftersale +
                ", isspecialoffer=" + isspecialoffer +
                ", shopingtotal=" + shopingtotal +
                ", shopingnumber='" + shopingnumber + '\'' +
                ", imgurl='" + imgurl + '\'' +
                ", userid='" + userid + '\'' +
                ", isuse=" + isuse +
                ", remark='" + remark + '\'' +
                ", remark1='" + remark1 + '\'' +
                ", remark2='" + remark2 + '\'' +
                ", createtime=" + createtime +
                ", shopingcode='" + shopingcode + '\'' +
                ", volume='" + volume + '\'' +
                ", weight='" + weight + '\'' +
                ", isassumelogistics=" + isassumelogistics +
                ", isnew=" + isnew +
                '}';
    }
}