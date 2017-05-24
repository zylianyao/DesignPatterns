import com.coderknock.sanchan.factory.Crawler;
import com.coderknock.sanchan.factory.abstractfactory.CrawlerFactory;
import com.coderknock.sanchan.factory.abstractfactory.impl.CrawlerOscFactory;
import com.coderknock.sanchan.factory.abstractfactory.impl.CrawlerSegmentFaultFactory;
import jodd.http.HttpRequest;

/**
 * <p>抽象工厂设计模式、单例模式</p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public class AbstractFactoryTest {

    public static void getFactory(String url) {
        HttpRequest httpRequest = HttpRequest.get(url);
        Crawler crawler = null;
        String host = httpRequest.host();
        String path = httpRequest.path();
        if (host.contains("oschina.net")) {
            CrawlerFactory crawlerFactory = new CrawlerOscFactory();
            if (host.contains("my.")) {
                crawler = crawlerFactory.createArticle(url);
            }
            if (path.contains("new")) {
                crawler = crawlerFactory.createNew(url);
            }
        } else if (host.contains("segmentfault.com")) {
            CrawlerFactory crawlerFactory = new CrawlerSegmentFaultFactory();
            if (path.contains("a/")) {
                crawler = crawlerFactory.createArticle(url);
            }
            if (path.contains("p/")) {
                crawler = crawlerFactory.createNew(url);
            }
        }
        crawler.crawler();

    }

    public static void main(String[] args) {
        getFactory("https://my.oschina.net/coderknock/blog/874260");
        getFactory("https://www.oschina.net/news/84486/intellij-idea-2017-2-eap");
        getFactory("https://segmentfault.com/a/1190000008802256");
        getFactory("https://segmentfault.com/p/1210000009063879/read");
    }

}
