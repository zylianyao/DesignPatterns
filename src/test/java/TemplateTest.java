import com.coderknock.sanchan.template.Article;
import com.coderknock.sanchan.template.JavaArticle;
import com.coderknock.sanchan.template.KotlinArticle;

/**
 * <p>模版模式</p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public class TemplateTest {
    public static void main(String[] args) {
        Article article=new KotlinArticle();
        article.show();
        Article javaArticle=new JavaArticle();
        javaArticle.show();
    }
}
