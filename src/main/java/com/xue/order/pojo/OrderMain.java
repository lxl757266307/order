package com.xue.order.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrderMain {
    private String orderId;

    private String singlePerson;

    private Date createTime;

    private BigDecimal totalNumber;

    private BigDecimal totalMoney;

    private String updatePerson;

    private String addressId;

    private Date updateTime;

    private String kindsId;

    private BigDecimal kindsPrice;

    private BigDecimal kindsNumber;

    private BigDecimal totalMoneey;

    private String userId;

    private String logiticsId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getSinglePerson() {
        return singlePerson;
    }

    public void setSinglePerson(String singlePerson) {
        this.singlePerson = singlePerson == null ? null : singlePerson.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(BigDecimal totalNumber) {
        this.totalNumber = totalNumber;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson == null ? null : updatePerson.trim();
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId == null ? null : addressId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getKindsId() {
        return kindsId;
    }

    public void setKindsId(String kindsId) {
        this.kindsId = kindsId == null ? null : kindsId.trim();
    }

    public BigDecimal getKindsPrice() {
        return kindsPrice;
    }

    public void setKindsPrice(BigDecimal kindsPrice) {
        this.kindsPrice = kindsPrice;
    }

    public BigDecimal getKindsNumber() {
        return kindsNumber;
    }

    public void setKindsNumber(BigDecimal kindsNumber) {
        this.kindsNumber = kindsNumber;
    }

    public BigDecimal getTotalMoneey() {
        return totalMoneey;
    }

    public void setTotalMoneey(BigDecimal totalMoneey) {
        this.totalMoneey = totalMoneey;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getLogiticsId() {
        return logiticsId;
    }

    public void setLogiticsId(String logiticsId) {
        this.logiticsId = logiticsId == null ? null : logiticsId.trim();
    }
}