package hooks;
import io.cucumber.java.*;
import utilities.Driver;


public class Hooks {

    @Before
    public void setUp() {
        System.out.println("Before methodu çalıştı");
    }

    @After
    public void tearDown()  {
        System.out.println("after methodu çalıştı");
        Driver.quitDriver();
    }
}
