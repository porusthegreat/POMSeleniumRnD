
import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by purushtoman on 21/8/17.
 */
public class TestBuild {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        List suites = new ArrayList();
        suites.add("/resources/testng.xml");
        testNG.setTestSuites(suites);
        testNG.run();
    }
}
