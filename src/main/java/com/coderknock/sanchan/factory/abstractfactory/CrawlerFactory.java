package com.coderknock.sanchan.factory.abstractfactory;

import com.coderknock.sanchan.factory.CrawlerArticle;
import com.coderknock.sanchan.factory.CrawlerNews;

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
public abstract class CrawlerFactory {
    
    public abstract CrawlerArticle createArticle(String url);

    public abstract CrawlerNews createNew(String url);
}
