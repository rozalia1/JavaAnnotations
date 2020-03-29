package Package;

import org.junit.Assert;

public class Testing {
    @TestAnnotation
    public void testSum(){
        int actual = Main.sumTwoNumbers(4,1);
     Assert.assertEquals(10,actual );
    }

    @TestAnnotation
    public void testMlu(){
        int actual = Main.mulThreeNumberes(1,2,3);
        Assert.assertEquals(6,actual);
    }
    @TestNameAnnotation
    public void testDetails(){
        String actual = Main.CheckDetails("Georgi");
        Assert.assertEquals("Georgi", actual);
    }
}
