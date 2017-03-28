package tools;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import ru.yandex.qatools.allure.annotations.Attachment;
import web.ui.tools.BrowserTool;

import java.io.IOException;

/**
 * Created by meicai on 2017/1/20.
 */

public class Itooklisten  implements IHookable {

    @Override
    public void run(IHookCallBack callBack, ITestResult testResult) {

        callBack.runTestMethod(testResult);
        if (testResult.getThrowable() != null) {
            try {
                takeScreenShot(testResult.getMethod().getMethodName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Attachment(value = "Failure in method {0}", type = "image/png")
    private byte[] takeScreenShot(String methodName) throws IOException {

        return ((TakesScreenshot) BrowserTool.Browser).getScreenshotAs(OutputType.BYTES);
    }
}
