package com.coderknock.sanchan.factory.simplefactory.impl;

import com.coderknock.sanchan.factory.simplefactory.Crawler;
import com.coderknock.sanchan.factory.simplefactory.pojo.CrawlerResult;
import jodd.jerry.Jerry;

/**
 * <p>爬取 OSChina 的文章</p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public class CrawlerOscBlog extends Crawler {

    public CrawlerOscBlog(String url) {
        super(url);
    }

    protected CrawlerResult execute(Jerry jerry) {
        //获取标题所在的元素
        Jerry titleJerry = jerry.find(".blog-heading .title");
        titleJerry.find("span").remove();
        String title = titleJerry.text().trim();
        //获取正文所在的元素
        Jerry body = jerry.find(".blog-body");
        String content;
        //删除无用的元素
        body.find("#blogContentLoading").remove();
        if (body.find("val").attr("data-value").equals("markdown")) {
            //删除无用的元素
            body.find(".BlogContent").remove();
            content = body.find(".noshow_content").html();
        } else {
            //删除无用的元素
            body.find("val").remove();
            Jerry contentJerry = body.find(".BlogContent");
            //删除无用的元素
            contentJerry.find("span").forEach(
                    n -> {
                        if (n.attr("id") != null && n.attr("id").startsWith("OSC")) {
                            n.remove();
                        }
                    }
            );
            content = contentJerry.html();
        }
        return new CrawlerResult(title, content);
    }
}
