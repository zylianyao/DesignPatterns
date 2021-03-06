package com.coderknock.sanchan.strategy;

/**
 * <p>VIP会员</p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public class VIPMemberStrategy implements MemberStrategy {
    @Override
    public String treatment() {
        return "VIP会员 99 免邮费，每月赠送优惠券";
    }
}
