package web.ui.tools.testsuites;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import tools.Itooklisten;
import tools.TestngLister;
import web.ui.tools.BrowserTool;

/**
 * Created by meicai on 2017/1/18.
 */

@Listeners({Itooklisten.class })
@Features("zf集成测试")
@Stories("zf集成测试-系统集成接口测试")
public class Hellotest3 {
    BrowserTool bt;
    @BeforeClass
    public void beforeclass(){
        bt=new BrowserTool();
        bt.window_openUrl("http://www.baidu.com.cn");
    }


    @Title("测试操作-配送业务操作")
    @Test(priority = 5)
    public  void test(){
        bt.element_Click(".//*[@id='s_tab']/a[800]");
       // Assert.fail();
    }


    @Title("测试操作-配送司机业务操作")
    @Test(priority = 3)
    public  void test1(){
        bt.element_Submit(".//*[@id='su']");
       // Assert.fail("just toe test error-screen");
    }


    @Title("测试操作-配送发货业务操作")
    @Test(priority = 1)
    public  void test2(){
        bt.element_Inputtext(".//*[@id='kw']","selenium");
    }


    @Title("测试操作-配送结算业务操作")
    @Test
    public  void test3(){}

    @Title(("退出CRM系统"))
    @AfterClass
    public void afterclass(){
        bt.window_closeBrowser();
    }
}
