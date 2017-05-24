package com.coderknock.sanchan.Proxy;

/**
 * <p>财务公司</p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public class FinanceCompany extends Company {

    @Override
    public void doAccount() {
        System.out.println("算账");
    }
}
