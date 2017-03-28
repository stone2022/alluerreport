package tools;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import web.ui.tools.BrowserTool;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * testNG执行case 失败后 ，testNG Listener会捕获执行失败
 * 如果要实现失败自动截图，需要重写Listener的onTestFailure方法
 *
 * @author Charlie.chen
 */
public class TestngLister extends TestListenerAdapter {

    public static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        driver= driver;
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        LogUtils.info("Test Success");
        super.onTestSuccess(tr);
        BrowserTool.window_takescreen();
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        LogUtils.error("Test Failure===========");
        super.onTestFailure(tr);
        BrowserTool.window_takescreen();
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        LogUtils.error("Test Skipped");
        super.onTestSkipped(tr);
    }

    @Override
    public void onStart(ITestContext testContext) {
        LogUtils.info("Test Finish");
        super.onStart(testContext);
    }

    @Override
    public void onFinish(ITestContext testContext) {
        LogUtils.info("Test Finish");
        super.onFinish(testContext);
    }

}