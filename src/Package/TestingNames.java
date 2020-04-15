package Package;

import assertPackage.myAssert;

import java.util.ArrayList;
import java.util.List;

public class TestingNames {
    @TestNameAnnotation
    public void testFirstName() throws Exception {
        String actual = Main.CheckFirstName("Georgi");
        myAssert.assertString(actual,"Georgi");
    }

    @TestNameAnnotation
    public void testLastName() throws Exception {
        String actual = Main.CheckLastName("Todorov");
        myAssert.assertString(actual,"Ivanov");
    }
    List<String> actions = new ArrayList<>();
    public List<String> returnActions(){
     actions.add("testFirstName");
     actions.add("testLastName");
       return actions;
    }
}
