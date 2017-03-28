//package web.ui.tools.testsuites;
//
//
//
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import ru.yandex.qatools.allure.annotations.Title;
//import web.ui.tools.BrowserTool;
//
//
///**
// * Created by meicai on 2017/1/10.
// */
//public class Logintest {
//    public  LoginPage login;
//    public BrowserTool browser;
//    @BeforeClass
//    public void beforeclass(){
//        browser=new BrowserTool();
//        login=new LoginPage(browser);
//
//    }
//
//
//    @Title("系统登录操作")
//    @Test(priority = 1)
//    public void loginoper(){
//        login.login();
//    }
//
//    @Title("csdn系统退出操作")
//    @Test(priority = 2)
//    public void loginquit(){
//         login.loginquit();
//    }
//
//
//    @AfterClass
//    public void closewindow(){
//        browser.window_closeBrowser();
//       // browser=null;
//    }
//}
