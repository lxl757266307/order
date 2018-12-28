package com.xue.order.pojo;

public class SpecialPrice {
    private String specialid;

    private String price;

    private String time;

    private String kindsid;

    private String remark;

    private Integer isuse;

    private Integer expire;

    private String userid;

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
}