import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;

public class FunnyAirlinesTest {
    @BeforeClass
    public static void testBeforeAll() {
        Main.isRunningTest = true;
    }


    @Test
    public void testGipszJakab() throws FileNotFoundException {
        Main.testInputPassengerName = "Gipsz Jakab";
        Main.main(null);
    }

    @Test
    public void testJaneSmith() throws FileNotFoundException {
        Main.testInputPassengerName = "Jane Smith";
        Main.main(null);
    }

    @Test
    public void testMickeyMouse() throws FileNotFoundException {
        Main.testInputPassengerName = "Mickey Mouse";
        Main.main(null);
    }


    @AfterClass
    public static void testAfterAll() {
        Main.isRunningTest = false;
    }
}
