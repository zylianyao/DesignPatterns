package com.coderknock.sanchan.strategy;

/**
 * <p></p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public class Client {
    //持有一个具体的策略对象
    private MemberStrategy strategy;

    /**
     * 构造函数，传入一个具体的策略对象
     *
     * @param strategy 具体的策略对象
     */
    public Client(MemberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 输出会员特权
     */
    public void showTreatment() {
        System.out.println(this.strategy.treatment());
    }
}
