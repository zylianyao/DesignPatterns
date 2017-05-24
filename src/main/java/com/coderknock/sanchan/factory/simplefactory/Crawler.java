package com.coderknock.sanchan.factory.simplefactory;

import com.coderknock.sanchan.factory.simplefactory.pojo.CrawlerResult;
import jodd.http.HttpRequest;
import jodd.http.HttpResponse;
import jodd.jerry.Jerry;

/**
 * <p>所有爬虫的父类</p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public abstract class Crawler {
    private String url;

    public Crawler(String url) {
        this.url = url;
    }

    public void crawler() {
        System.out.println("===========正在爬取" + url + " ==========");
        //使用 jodd http 获取网站数据
        HttpResponse response = HttpRequest.get(url).timeout(10000).send();
        //将网站的数据转为可以进行进一步分析的 Jerry 对象
        Jerry jerry = Jerry.jerry(response.bodyText());
        //将 jerry 传入子类实现的  execute 方法，具体操作由子类决定之后返回爬取到的数据
        System.out.println(execute(jerry));
        System.out.println("===========爬取完成" + url + "==========");
    }

    /**
     * 具体的爬取逻辑由子类具体实现
     *
     * @return
     */
    protected abstract CrawlerResult execute(Jerry jerry);
}
