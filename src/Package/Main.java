package Package;

import java.lang.reflect.Method;

public class Main {

    public static int sumTwoNumbers(int a, int b){

        return a+b;
    }
    public static int mulThreeNumberes (int a, int b, int c){

        return a*b*c;
    }
    public static String CheckDetails(String name){

        return name;
    }

    public static void main(String[] args) {
        Class Test1 = Testing.class;
        Method[] MasiveMethod = Test1.getDeclaredMethods();
        for(Method method: MasiveMethod){
            if(method.isAnnotationPresent(TestAnnotation.class)) {
                try {
                    method.invoke(Test1.newInstance());
                    System.out.printf("The test function '%s'  is passed.%n", method.getName());
                } catch (Exception ex) {
                    System.out.printf("The function '%s' is failed. %s %n", method.getName(), ex.getCause());

                }
            } else if(method.isAnnotationPresent(TestNameAnnotation.class)) {

                try {
                    method.invoke(Test1.newInstance());
                    System.out.printf("The test function '%s'  is passed.%n", method.getName());
                }
                catch (Exception ex){
                    System.out.printf("The function '%s' is failed. %s %n" , method.getName(), ex.getCause());
                }
            }

        }


    }
}

