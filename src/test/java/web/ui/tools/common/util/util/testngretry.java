package web.ui.tools.common.util.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Created by meicai on 2017/1/19.
 */
public class testngretry implements ITestListener {
    @Override
   public void onTestStart(ITestResult var1){
        System.out.println("test===start===="+var1.getTestName()+"method======"+var1.getMethod());
    };
    @Override
   public  void onTestSuccess(ITestResult var1){};
    @Override
    public void onTestFailure(ITestResult var1){
        System.out.println("all aaaaa===="+ ff.name);
        System.out.println("test cas is wrong========"+var1.getTestName()+"method===="+var1.getMethod().getMethodName());
        //testbase.getWebdriver();
    };
    @Override
    public void onTestSkipped(ITestResult var1){};
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult var1){};
    @Override
   public   void onStart(ITestContext var1){};
    @Override
    public void onFinish(ITestContext var1){};
}
