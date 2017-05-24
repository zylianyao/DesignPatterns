package com.coderknock.sanchan.factory.simplefactory;

import jodd.http.HttpRequest;
import jodd.props.Props;
import jodd.util.ClassLoaderUtil;
import jodd.util.StringUtil;

import java.io.IOException;
import java.util.HashMap;

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
public class CrawlerFactory {
    //获取配置爬虫与网站的关联关系
    private static final Props props = new Props();
    //存储对象的单例
    private static final HashMap<String, Crawler> crawlerObjectMap = new HashMap<String, Crawler>();

    private CrawlerFactory() {
    }

    /**
     * 一些初始化工作
     */
    static {
        try {
            props.load(CrawlerFactory.class.getClassLoader().getResourceAsStream("crawler.props"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.err.println("初始化失败");
        }
    }

    /**
     * 根据 url 获取 爬虫
     *
     * @param url
     * @return
     */
    public static Crawler getCrawler(String url) {
        HttpRequest httpRequest = HttpRequest.get(url);
        String host = httpRequest.host();
        String path = httpRequest.path();
        String className = props.getValue(host, path.substring(0, (path.substring(1, path.length()).indexOf("/") + 1)));
        if (StringUtil.isEmpty(className)) {
            System.err.println("还未支持该网站的爬取！");
        } else {
            if (crawlerObjectMap.containsKey(className)) {
                return crawlerObjectMap.get(className);
            } else {
                try {
                    Crawler crawlerObject = (Crawler) ClassLoaderUtil.loadClass("com.coderknock.sanchan.factory.simplefactory.impl." + className).getConstructor(String.class).newInstance(url);
                    return crawlerObject;
                } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("获取爬虫失败");
                }

            }
        }
        return null;
    }
}
