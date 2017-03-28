package web.ui.tools.testsuites;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import tools.TestngLister;

/**
 * Created by meicai on 2017/1/18.
 */

@Listeners({ TestngLister.class })
@Features("回归测试")
@Stories("回归测试-接口测试-产品测试")
public class Hellotest2 {

    @Title("测试操作-购物车选购业务操作")
    @Test
    public  void test(){
        Assert.fail();
    }


    @Title("测试操作-购物车订单业务操作")
    @Test
    public  void test1(){}


    @Title("测试操作-购物车支付操作")
    @Test
    public  void test2(){}


    @Title("测试操作-购物车结算操作")
    @Test
    public  void test3(){}

}
