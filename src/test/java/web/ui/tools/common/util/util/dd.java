package web.ui.tools.common.util.util;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by meicai on 2017/1/19.
 */
@Listeners({testngretry.class})
public class dd {

    @BeforeClass
    public void beforeclass(){
        ff aa=new ff("hahha");
    }
    @Test
    public void error(){
        Assert.fail();

    }
}
