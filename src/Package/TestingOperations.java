package Package;


import assertPackage.myAssert;

import java.util.ArrayList;
import java.util.List;


public class TestingOperations {
    @TestAnnotation
    public void testSum() throws Exception {
        int actual = Main.sumTwoNumbers(4, 1);
        myAssert.assertNumbers(actual, 10);
    }

    @TestAnnotation
    public void testMlu() throws Exception {
        int actual = Main.mulThreeNumberes(1, 2, 3);
        myAssert.assertNumbers(actual, 6);
    }

    List<String> actions = new ArrayList<>();

    public List<String> returnActions() {
        actions.add("testSum");
        actions.add("testMlu");
        return actions;
    }
}