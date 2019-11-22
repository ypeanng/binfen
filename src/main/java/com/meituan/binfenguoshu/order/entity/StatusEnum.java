package com.meituan.binfenguoshu.order.entity;

public enum StatusEnum {
    submit(1, "已提交"),
    paid(2, "已付款"),
    confirmed(4, "商家已确认"),
    transfered(6, "订单配送中"),
    received(7, "订单已送达"),
    completed(8, "订单完成"),
    cancel(9, "订单已取消");
    int id;
    String type;

    StatusEnum(int id, String type) {
        this.id = id;
        this.type = type;
    }

    StatusEnum getById(int id){
        for (int i = 0; i < values().length; i++) {
            StatusEnum statusEnum = values()[i];
            if(statusEnum.id==id){
                return statusEnum;
            }
        }
        return null;
    }
}
