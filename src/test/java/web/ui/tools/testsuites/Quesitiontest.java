//package web.ui.tools.testsuites;
//
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import ru.yandex.qatools.allure.annotations.Title;
//import web.ui.tools.BrowserTool;
//
///**
// * Created by meicai on 2017/1/16.
// */
//public class Quesitiontest {
//    LoginPage login;
//    BrowserTool browser;
//    String question_model="//a[@id='app_List']";
//    String question_text="//div[3]/div[2]/div[1]/div/ul/li[5]/em/a";
//    String question_title="//input[@id='txtQuestion']";
//    String question_title_text="UI自动化目前常用的解决方案有哪些";
//    String question_content_frameid="txtContent_ifr";
//
//    @BeforeClass
//    public void beforeclass(){
//        browser=new BrowserTool();
//        login=new LoginPage(browser);
//        login.login();
//    }
//
//    @Title("选择提问模块")
//    @Test(priority = 0)
//    public void choicequestionmode(){
//        browser.element_Click(question_model);
//    }
//
//    @Title("选择提问连接")
//    @Test(priority = 1)
//    public void choicequestiontext(){
//        browser.element_Click(question_text);
//    }
//
//    @Title("输入提问标题信息")
//    @Test(priority = 2)
//    public void choicequestiontitle(){
//        browser.element_Inputtext(question_title,question_title_text);
//    }
//
//
//}
