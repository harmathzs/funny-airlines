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
    public void testMain() throws FileNotFoundException {
        Main.main(null);
    }

    @AfterClass
    public static void testAfterAll() {
        Main.isRunningTest = false;
    }
}
