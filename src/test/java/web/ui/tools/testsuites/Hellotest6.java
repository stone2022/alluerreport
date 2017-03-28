package web.ui.tools.testsuites;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import tools.TestngLister;

/**
 * Created by meicai on 2017/1/18.
 */

@Listeners({ TestngLister.class })
@Features("调试测试")
@Stories("调试测试-接口测试")
public class Hellotest6 {

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
    public  void test3(){
        Assert.assertEquals("ff","as");
    }

}
