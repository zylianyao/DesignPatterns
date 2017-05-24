package com.coderknock.sanchan.factory.pojo;

/**
 * <p>爬取结果实体类</p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public class CrawlerResult {

    //文章标题
    private String title;
    //文章的内容
    private String htmlContent;

    public CrawlerResult(String title, String htmlContent) {
        this.title = title;
        this.htmlContent = htmlContent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    @Override
    public String toString() {
        return "标题：'" + title + '\'' +
                ", 内容：'" + htmlContent + '\'';
    }
}
