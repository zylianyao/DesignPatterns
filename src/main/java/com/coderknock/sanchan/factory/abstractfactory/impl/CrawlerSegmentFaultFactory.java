package com.coderknock.sanchan.factory.abstractfactory.impl;

import com.coderknock.sanchan.factory.CrawlerArticle;
import com.coderknock.sanchan.factory.CrawlerNews;
import com.coderknock.sanchan.factory.abstractfactory.CrawlerFactory;
import com.coderknock.sanchan.factory.impl.CrawlerSegmentFaultArticle;
import com.coderknock.sanchan.factory.impl.CrawlerSegmentFaultNews;

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
    public CrawlerArticle createArticle(String url) {
        return new CrawlerSegmentFaultArticle(url);
    }

    @Override
    public CrawlerNews createNew(String url) {
        return new CrawlerSegmentFaultNews(url);
    }
}
