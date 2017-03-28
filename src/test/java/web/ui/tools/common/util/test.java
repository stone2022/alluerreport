package web.ui.tools.common.util;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import web.ui.tools.common.util.util.ff;

/**
 * Created by meicai on 2017/1/19.
 */
@Listeners({testngretry.class})
public class test {

    @BeforeClass
    public void beforeclass(){
        ff aa=new ff("woshishui");
    }
    @Test
    public void error(){
        Assert.fail();

    }
}
