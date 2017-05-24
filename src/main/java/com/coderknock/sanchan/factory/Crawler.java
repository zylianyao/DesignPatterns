package com.coderknock.sanchan.factory;

import com.coderknock.sanchan.factory.pojo.Article;
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
    protected String url;

    public Crawler(String url) {
        this.url = url;
    }

    public abstract void crawler();

    /**
     * 具体的爬取逻辑由子类具体实现
     *
     * @return
     */
    protected abstract Article execute(Jerry jerry);
}
