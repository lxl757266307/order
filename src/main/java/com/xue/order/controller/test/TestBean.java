package com.xue.order.controller.test;

import java.io.Serializable;

public class TestBean  implements Serializable {
    String card;
    String name;
    String sex;
    String util;
    String number;

    @Override
    public String toString() {
        return "TestBean{" +
                "card='" + card + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", util='" + util + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUtil() {
        return util;
    }

    public void setUtil(String util) {
        this.util = util;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
