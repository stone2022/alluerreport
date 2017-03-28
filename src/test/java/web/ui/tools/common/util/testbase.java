package web.ui.tools.common.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by meicai on 2017/1/19.
 */
public class testbase {
    public static WebDriver wd;
    static {
        wd=new FirefoxDriver();
        System.out.println("webdriver="+wd);
    }

    public static  WebDriver getWebdriver(){
        return wd;
    }
    public static void main(String[] a){}
}
