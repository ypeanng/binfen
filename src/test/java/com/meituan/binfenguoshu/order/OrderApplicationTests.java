package com.meituan.binfenguoshu.order;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.meituan.binfenguoshu.order.entity.Orders;
import com.meituan.binfenguoshu.order.helper.JsonUtil;
import com.meituan.binfenguoshu.order.mapper.OrdersMapper;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderApplicationTests {

    @Autowired
    private OrdersMapper ordersMapper;

    @Test
    public void testSelect() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("order_id","81078943058679224");
        Orders order = ordersMapper.selectOne(queryWrapper);
        System.out.println(JsonUtil.toJson(order));
    }

    @Test
    public void encodeName() throws UnsupportedEncodingException {
        String name = "%E4%B8%87%E9%95%BF%E5%8F%91%28%E5%85%88%E7%94%9F%29";
        System.out.println(URLDecoder.decode(name,"UTF-8"));;
    }

}
