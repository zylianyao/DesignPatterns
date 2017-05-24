import com.coderknock.sanchan.strategy.Client;
import com.coderknock.sanchan.strategy.GeneralMemberStrategy;
import com.coderknock.sanchan.strategy.MemberStrategy;
import com.coderknock.sanchan.strategy.VIPMemberStrategy;

/**
 * <p>策略模式</p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public class StrategyTest {
    public static void main(String[] args) {
        //选择并创建需要使用的策略对象
        MemberStrategy strategy = new GeneralMemberStrategy();
        //创建客户端
        Client client = new Client(strategy);
        //输出特权信息
        client.showTreatment();
        //选择并创建需要使用的策略对象
        strategy = new VIPMemberStrategy();
        //创建客户端
        client = new Client(strategy);
        //输出特权信息
        client.showTreatment();
    }
}
