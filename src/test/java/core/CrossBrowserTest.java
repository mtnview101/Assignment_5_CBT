package core;
import org.testng.annotations.*;

public class CrossBrowserTest {
       @Parameters({"browser"})
       @Test
       public void test(String browser) {
              System.out.println(browser);}  // Firefox
}

