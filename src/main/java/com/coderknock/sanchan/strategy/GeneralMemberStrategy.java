package com.coderknock.sanchan.strategy;

/**
 * <p>普通会员</p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public class GeneralMemberStrategy implements MemberStrategy {
    @Override
    public String treatment() {
        return "普通会员 159 免邮费";
    }
}
