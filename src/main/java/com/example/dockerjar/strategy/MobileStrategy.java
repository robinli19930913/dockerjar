package com.example.dockerjar.strategy;

/**
 * @Description TODO
 * @Author robin
 * @Date 2019/4/21 22:26
 */
public class MobileStrategy implements Strategy {
    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge;
    }
}