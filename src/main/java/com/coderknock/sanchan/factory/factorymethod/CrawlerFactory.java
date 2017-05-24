package com.coderknock.sanchan.factory.factorymethod;

import com.coderknock.sanchan.factory.Crawler;

/**
 * <p>爬虫工厂</p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public abstract class CrawlerFactory {

    /**
     * 根据 url 获取 爬虫
     *
     * @param url
     * @return
     */
    public abstract Crawler getCrawler(String url);
}

