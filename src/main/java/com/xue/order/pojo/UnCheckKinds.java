package com.xue.order.pojo;

public class UnCheckKinds {
    private String id;

    private String userName;

    private String shoppingPhoto;

    private Integer isuse;

    private String userid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getShoppingPhoto() {
        return shoppingPhoto;
    }

    public void setShoppingPhoto(String shoppingPhoto) {
        this.shoppingPhoto = shoppingPhoto == null ? null : shoppingPhoto.trim();
    }

    public Integer getIsuse() {
        return isuse;
    }

    public void setIsuse(Integer isuse) {
        this.isuse = isuse;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}