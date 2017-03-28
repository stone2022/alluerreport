package web.ui.tools.testsuites;

import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by meicai on 2017/1/18.
 */

@Features("集成测试")
@Stories("回归测试-接口测试")
public class Hellotest4 {

    @Title("测试操作-采购业务操作")
    @Test
    public  void test(){}


    @Title("测试操作-晨采业务操作")
    @Test
    public  void test1(){}


    @Title("测试操作-补采业务操作")
    @Test
    public  void test2(){}


    @Title("测试操作-并购业务操作")
    @Test
    public  void test3(){}

}
