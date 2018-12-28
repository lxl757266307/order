package com.xue.order.schedu;

import com.xue.order.dao.KindsMapper;
import com.xue.order.dao.SpecialPriceMapper;
import com.xue.order.dao.SpecialShopingMapper;
import com.xue.order.pojo.Kinds;
import com.xue.order.pojo.SpecialPrice;
import com.xue.order.pojo.SpecialPriceExample;
import com.xue.order.pojo.SpecialShoping;
import com.xue.order.service.jedis.JedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Jobs {


    @Autowired
    KindsMapper kindsMapper;
    @Autowired
    SpecialPriceMapper specialPriceMapper;
    @Autowired
    JedisClient jedisClient;

    @Scheduled(cron = "50 59 23 * * ?")
    public void cronJob() {

        List<SpecialPrice> specialShopings = specialPriceMapper.selectByExample(new SpecialPriceExample());
        if (specialShopings != null) {

            if (specialShopings.size() > 0) {
                for (int i = 0; i < specialShopings.size(); i++) {
                    String kindsId = jedisClient.get(specialShopings.get(i).getSpecialid());
                    if (kindsId == null) {
                        specialPriceMapper.updateSpecialStatus(0, specialShopings.get(i).getKindsid());
                        kindsMapper.updateKindsSpecialOfferById(0, specialShopings.get(i).getKindsid());
                    }


                }
            }
        }


    }

}
