import com.coderknock.sanchan.factory.simplefactory.CrawlerFactory;

/**
 * <p>简单工厂设计模式</p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        CrawlerFactory.getCrawler("https://my.oschina.net/coderknock/blog/874260").crawler();
        CrawlerFactory.getCrawler("https://segmentfault.com/a/1190000008802256").crawler();
    }

}
