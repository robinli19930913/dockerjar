package com.example.dockerjar.strategy;

/**
 * @Description TODO
 * @Author robin
 * @Date 2019/4/21 22:27
 */
public class CardStrategy implements Strategy {
    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge+charge*0.01;
    }
}
