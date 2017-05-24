package com.coderknock.sanchan.strategy;

/**
 * <p>会员策略</p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public interface MemberStrategy {
    /**
     * 计算图书的价格
     *
     * @param 享受的待遇
     * @return 计算出打折后的价格
     */
    public String treatment();
}
