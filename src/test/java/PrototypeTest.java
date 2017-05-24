import com.coderknock.sanchan.prototype.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>原型模式</p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Text text = new Text();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
        }
        text.setLines(list);
        System.out.println("Ctrl C Ctrl V");
        Text text2=text.clone();
        System.out.println(text2==text);
        System.out.println(text);
        System.out.println(text2);
    }

}
