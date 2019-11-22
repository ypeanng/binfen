package com.meituan.binfenguoshu.order.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("biz_orders")
public class Orders {
    @TableField("order_id")
    private Long orderId;

    @TableField("recipient_name")
    private String name;

    @TableField("recipient_phone")
    private String telphone;

    @TableField("status")
    private String status;

    private Long id;
}
