package web.ui.tools.testsuites;

import org.testng.annotations.Listeners;
import tools.TestngLister;
import web.ui.tools.BrowserTool;

/**
 * Created by meicai on 2017/1/16.
 */

@Listeners({ TestngLister.class })
public class LoginPage {
    String url="https://passport.cnblogs.com/user/signin?ReturnUrl=http%3A%2F%2Fwww.cnblogs.com%2F";
    String usernamepath="//input[@id='input1']";
    String username="stonezf";
    String userpwdpath="//input[@id='input2']";
    String userpwd="zftest";
    String loginpath="//input[@id='signin']";
    String titole="博客园";
    String loginquitpath="//span[@id='span_userinfo']//a[.='退出']";
    BrowserTool browser;
    LoginPage(BrowserTool tool){
        browser=tool;
    }
    public void login(){
        browser.window_openUrl(url);
        browser.element_Inputtext(usernamepath,username);
        browser.element_Inputtext(userpwdpath,userpwd);
        browser.element_Click(loginpath);
    }

    public void loginquit(){
        browser.element_Click(loginquitpath);
        browser.window_alertDialog();
    }
}
