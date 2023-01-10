package hooks;
import io.cucumber.java.*;


public class Hooks {

    @Before
    public void setUp() {
        System.out.println("Before methodu çalıştı");
    }

    @After
    public void tearDown()  {
        System.out.println("after methodu çalıştı");
    }
}
