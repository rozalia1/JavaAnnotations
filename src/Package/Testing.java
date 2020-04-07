package Package;


import assertPackage.myAssert;


public class Testing {
    @TestAnnotation
    public void testSum() throws Exception {
        int actual =Main.sumTwoNumbers(4,1);
        myAssert.assertNumbers(actual, 10);
    }

    @TestAnnotation
    public void testMlu() throws Exception {
        int actual = Main.mulThreeNumberes(1,2,3);
        myAssert.assertNumbers(actual, 6);
}
    @TestNameAnnotation
    public void testDetails() throws Exception {
        String actual = Main.CheckDetails("Georgi");
        myAssert.assertString(actual,"Georgi");
    }
}
