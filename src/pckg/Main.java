package pckg;

import java.lang.reflect.Method;

public class Main {
    public static int subNumber(int a, int b){
        return a-b;
    }

    public static int getAge(){
        return 24;
    }

    public static void main(String[] args) {
        Class classTests = Tests.class;
        Method[] testMethods = classTests.getDeclaredMethods();
        int count = 0;

        for (Method method: testMethods) {
            try {
                method.invoke(classTests.newInstance());
                System.out.printf("%s - Test '%s' - passed %n", ++count, method.getName());
            } catch (Throwable ex) {
                System.out.printf("%s - Test '%s' - failed: %s %n", ++count, method.getName(), ex.getCause());
            }
        }
    }
}
