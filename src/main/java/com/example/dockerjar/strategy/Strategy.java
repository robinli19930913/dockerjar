package com.example.dockerjar.strategy;

/**
 * @Description TODO
 * @Author robin
 * @Date 2019/4/21 22:19
 */
public interface Strategy {
    /**
     *
     *作者：alaric
     *时间：2013-8-5上午11:05:11
     *描述：策略行为方法
     */
    public Double calRecharge(Double charge ,RechargeTypeEnum type );
}
