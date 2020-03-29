package pckg;

import org.junit.Assert;
import org.junit.Test;

@MyAnnotation(firstName = "Rozalia", lastName = "Marinova", age = 24)
public class Tests {
    @MyAnnotation
    public void checkAge() {
        int actual = Main.getAge();
        Assert.assertEquals(24, actual);
    }

    @Test
    public void TestIsZero() {
        int actual = Main.subNumber(0, 0);
        Assert.assertEquals(0, actual);
    }

    @Test
    public void TestIsNotZero() {
        int actual = Main.subNumber(5, 0);
        Assert.assertEquals(0, actual);
    }
}