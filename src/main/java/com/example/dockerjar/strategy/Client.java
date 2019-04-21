package com.example.dockerjar.strategy;

/**
 * @Description TODO
 * @Author robin
 * @Date 2019/4/21 22:27
 */
public class Client {
    /**
     * 需求如下：

     某支付系统接入以下几种商户进行充值：
     易宝网易，快线网银，19pay手机支付，支付宝支付，骏网一卡通，
     由于每家充值系统的结算比例不一样，而且同一家商户的不同充值方式也有所不同，
     具体系统情况比较复杂，像支付宝既有支付宝账号支付和支付宝网银支付等这些暂时不考虑，
     为了讲述策略模式这里简单描述，假如分为四种，手机支付，网银支付，商户账号支付和点卡支付。
     因为没个支付结算比例不同，所以对手续费低的做一些优惠活动，
     尽可能让用户使用手续费低的支付方式来充值，这样降低渠道费用，增加收入，
     具体优惠政策如下：

     ①网银充值，8.5折；

     ②商户充值，9折；

     ③手机充值，没有优惠；

     ④点卡充值，收取1%的渠道费；
     * @param args
     */
    public static void main(String[] args) {

        Context context = new Context();
        // 网银充值100 需要付多少
        Double money = context.calRecharge(100D,
                RechargeTypeEnum.E_BANK.value());
        System.out.println(money);

        // 商户账户充值100 需要付多少
        Double money2 = context.calRecharge(100D,
                RechargeTypeEnum.BUSI_ACCOUNTS.value());
        System.out.println(money2);

        // 手机充值100 需要付多少
        Double money3 = context.calRecharge(100D,
                RechargeTypeEnum.MOBILE.value());
        System.out.println(money3);

        // 充值卡充值100 需要付多少
        Double money4 = context.calRecharge(100D,
                RechargeTypeEnum.CARD_RECHARGE.value());
        System.out.println(money4);
    }
}
