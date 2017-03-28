package web.ui.tools;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

/**
 * Created by meicai on 2017/1/10.
 */
public class BrowserTool {
    public static WebDriver Browser;
    public int time=GlobalSettings.inter_time;
    public BrowserTool(){
        init();
    }
    public void init() {
        if(GlobalSettings.browser_type==1) {
            Browser = new FirefoxDriver();
        }else if(GlobalSettings.browser_type==2){
            System.setProperty("webdriver.chrome.driver","res//WebUI//chromedriver.exe");
            Browser=new ChromeDriver();
        }else{
            //System.exit(-1);
        }
    }

    public void window_openUrl(String url){
          waitTime(time);
          Browser.get(url);
    }

    public void window_closeBrowser(){
        waitTime(time);
        Browser.quit();
    }
    public void window_maxBrowser(){
        waitTime(time);
        Browser.quit();
    }
    public void window_alertDialog(){
        waitTime(time);
        Alert alert=Browser.switchTo().alert();
        alert.accept();
    }
    public void window_switchBrowser(){
        waitTime(time);
        Set<String> windows=Browser.getWindowHandles();
        String currentwindow=Browser.getWindowHandle();
        for(String window:windows ){
              if(window==currentwindow){
                  continue;
              }
              Browser.switchTo().window(window);

        }

    }
//    public void window_takeScreenShot(String filename){
//        waitTime(time);
//        File srcfile =((TakesScreenshot) Browser).getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(srcfile, new File("testresult\\images" + filename + ".png"));
//        }catch (IOException io){
//            io.printStackTrace();
//        }
//    }
                                          

    public void element_Click(String path){
        waitTime(time);
         element_Findxpath(path).click();
    }

    public void element_Submit(String path){
        waitTime(time);
         element_Findxpath(path).submit();
    }

    public WebElement element_Findxpath(String xpath){
        waitTime(time);
        return Browser.findElement(By.xpath(xpath));
    }
    public void element_Inputtext(String xpath,String value){
        waitTime(time);
        element_Findxpath(xpath).sendKeys(value);
    }

    public void window_checktile(String title){
        Boolean flag=Browser.getTitle().contains(title);
        if(!flag){
            new Throwable("标题匹配不成功 请确认");
        }

    }

    public  void window_windowswitchframe(String frame){
        waitTime(time);
        Browser.switchTo().frame(frame);
    }

    public void windw_frametowindow(){
        waitTime(time);
        Browser.switchTo().defaultContent();
    }

    public void waitTime(int n){
       try{
           Thread.sleep(n);
       }catch (Exception e){
           e.printStackTrace();
       }

    }
    public void window_mousemove(String path){
        waitTime(time);
        Actions action =new Actions(Browser);
        action.moveToElement(Browser.findElement(By.xpath(path))).perform();
        waitTime(time);


    }
    public static void window_takescreen()  {
        File srcFile =((TakesScreenshot)Browser).getScreenshotAs(OutputType.FILE);
        String path=System.getProperty("user.dir")+"\\testresult\\images\\"+window_getCurrentTime()+".png";
        try {
            FileUtils.copyFile(srcFile,new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String window_getCurrentTime(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String currentTime=sdf.format(date);
        return currentTime;
    }

    public static void main(String[] arg){
        BrowserTool test=new BrowserTool();
        test.window_takescreen();
        test.window_openUrl("http://www.baidu.com.cn");

    }

}
