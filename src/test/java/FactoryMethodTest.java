import com.coderknock.sanchan.factory.Crawler;
import com.coderknock.sanchan.factory.factorymethod.CrawlerFactory;
import jodd.http.HttpRequest;
import jodd.props.Props;
import jodd.util.ClassLoaderUtil;
import jodd.util.StringUtil;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * <p>工厂方法设计模式、单例模式</p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public class FactoryMethodTest {
    //获取配置爬虫工厂与网站的关联关系
    private static final Props props = new Props();

    /**
     * 一些初始化工作
     */
    static {
        try {
            props.load(com.coderknock.sanchan.factory.factorymethod.CrawlerFactory.class.getClassLoader().getResourceAsStream("crawlerFactory.props"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.err.println("初始化失败");
        }
    }

    public static void getFactory(String url) {
        HttpRequest httpRequest = HttpRequest.get(url);
        String host = httpRequest.host();
        String path = httpRequest.path();
        String className = props.getValue(host, path.substring(0, (path.substring(1, path.length()).indexOf("/") + 1)));
        if (StringUtil.isEmpty(className)) {
            System.err.println("还未支持该网站的爬取！");
        } else {
            try {
                //根据不同地址生成不同工厂
                CrawlerFactory crawlerFactory = (CrawlerFactory) ClassLoaderUtil.loadClass("com.coderknock.sanchan.factory.factorymethod.impl." + className).getConstructor().newInstance();
                Crawler crawler = crawlerFactory.getCrawler(url);
                crawler.crawler();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        getFactory("https://my.oschina.net/coderknock/blog/874260");
        getFactory("https://segmentfault.com/a/1190000008802256");
    }

}
