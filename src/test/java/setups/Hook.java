package setups;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends DriverSetup{

    @Before
    public void before() throws Exception {
        browserStart();
    }

    @After
    public void after() throws Exception {
        browserStop();
    }
}