package com.coderknock.sanchan.factory.impl;

import com.coderknock.sanchan.factory.CrawlerNews;
import com.coderknock.sanchan.factory.pojo.Article;
import jodd.jerry.Jerry;

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
public class CrawlerSegmentFaultNews extends CrawlerNews {
    public CrawlerSegmentFaultNews(String url) {
        super(url);
    }

    @Override
    protected Article execute(Jerry jerry) {
        //文章内容
        Jerry blogContent = jerry.find(".news__read");
        Jerry content = blogContent.find(".news__read-content");
        content.find(".news__read-footer").remove();
        String title = jerry.find("h1.news__read-title").text().trim();
        return new Article(title, content.html());
    }
}
