package com.coderknock.sanchan.factory.impl;

import com.coderknock.sanchan.factory.Crawler;
import com.coderknock.sanchan.factory.CrawlerArticle;
import com.coderknock.sanchan.factory.pojo.Article;
import jodd.jerry.Jerry;

/**
 * <p>SegmentFault 文章爬取</p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public class CrawlerSegmentFaultArticle extends CrawlerArticle {

    public CrawlerSegmentFaultArticle(String url) {
        super(url);
    }

    @Override
    protected Article execute(Jerry jerry) {
        //文章内容
        Jerry blogContentJerry = jerry.find(".article__content");
        //文章标题
        String title = jerry.find("#articleTitle a").text().trim();
        return new Article(title, blogContentJerry.html());
    }

}
