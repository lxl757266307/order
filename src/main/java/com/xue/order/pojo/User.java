package com.xue.order.pojo;

import java.util.Date;

public class User {
    private String id;

    private String username;

    private String password;

    private String address;

    private Integer isfree;

    private Integer usertype;

    private String remark1;

    private String remark2;

    private String phone;

    private String imgurl;

    private Integer online;

    private String cardnumber;

    private Date createtime;

    private Integer status;

    private String adminname;

    private String realname;

    private String shoppingphoto;

    private String kindid;

    private String bandcard;

    private String paycodephoto;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getIsfree() {
        return isfree;
    }

    public void setIsfree(Integer isfree) {
        this.isfree = isfree;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber == null ? null : cardnumber.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getShoppingphoto() {
        return shoppingphoto;
    }

    public void setShoppingphoto(String shoppingphoto) {
        this.shoppingphoto = shoppingphoto == null ? null : shoppingphoto.trim();
    }

    public String getKindid() {
        return kindid;
    }

    public void setKindid(String kindid) {
        this.kindid = kindid == null ? null : kindid.trim();
    }

    public String getBandcard() {
        return bandcard;
    }

    public void setBandcard(String bandcard) {
        this.bandcard = bandcard == null ? null : bandcard.trim();
    }

    public String getPaycodephoto() {
        return paycodephoto;
    }

    public void setPaycodephoto(String paycodephoto) {
        this.paycodephoto = paycodephoto == null ? null : paycodephoto.trim();
    }
}