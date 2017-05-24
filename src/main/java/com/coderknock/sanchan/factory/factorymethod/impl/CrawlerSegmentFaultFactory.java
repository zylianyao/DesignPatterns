package com.coderknock.sanchan.factory.factorymethod.impl;

import com.coderknock.sanchan.factory.Crawler;
import com.coderknock.sanchan.factory.factorymethod.CrawlerFactory;
import com.coderknock.sanchan.factory.impl.CrawlerSegmentFault;

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
public class CrawlerSegmentFaultFactory extends CrawlerFactory {

    @Override
    public Crawler getCrawler(String url) {
        return new CrawlerSegmentFault(url);
    }
}
