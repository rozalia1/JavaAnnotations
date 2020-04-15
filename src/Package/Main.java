package Package;

import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static int sumTwoNumbers(int a, int b){

        return a+b;
    }
    public static int mulThreeNumberes (int a, int b, int c){

        return a*b*c;
    }
    public static String CheckFirstName(String name){

        return name;
    }
    public static String CheckLastName(String name){

        return name;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> options = new HashMap<String, Integer>();
        options.put("TestingOperations.java", 0);
        options.put("TestingNames.java", 0);
        boolean working = true;
        while (working == true) {

                System.out.println();
                System.out.println("Choose an option between [1-4]:");
                System.out.println("1.Enter a valid class name: The valid ones are: TestingNames.java and TestingOperations.java");
                System.out.println("2.Show all the ran methods:");
                System.out.println("3.Show the method which was ran the most rare:");
                System.out.println("4.Show the method which was ran the most:");
                System.out.println("5. If yu want to exit the program press number 9:");
                Scanner sc = new Scanner(System.in);
                int option = sc.nextInt();
                if (option != 9) {
                    switch (option) {
                        case 1: {
                            System.out.println("1.Enter a class name:");
                            String fileName = sc.next();
                            if (fileName.equals("TestingOperations.java")) {
                                returnOperations();
                                options.put("TestingOperations.java", options.get("TestingOperations.java") + 1);
                            } else if (fileName.equals("TestingNames.java")) {
                                resultNames();
                                options.put("TestingNames.java", options.get("TestingNames.java") + 1);
                            } else {
                                System.out.println("This class doesn't exsists!");
                            }
                            break;
                        }
                        case 2: {

                            System.out.println("2.Show all the ran methods:");
                            int numberNames = options.get("TestingNames.java");


                            for (int i = 0; i < numberNames; i++) {
                                TestingNames objectNames = new TestingNames();
                                System.out.println(objectNames.returnActions());
                            }
                            int numberOperations = options.get("TestingOperations.java");


                            for (int i = 0; i < numberOperations; i++) {
                                TestingOperations objectOperations = new TestingOperations();
                                System.out.println(objectOperations.returnActions());
                            }
                            if (numberNames == 0 && numberOperations == 0) {
                                System.out.println("There aren't any ran methods!!!");
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("3.Show the method which was ran the most rare:");
                            int numberOperationsR = options.get("TestingOperations.java");
                            int numberNamesR = options.get("TestingNames.java");
                            if (numberOperationsR < numberNamesR) {
                                TestingOperations objectOperations = new TestingOperations();

                                System.out.println("The methods which are ran the most rare are: " + objectOperations.returnActions());
                            } else if (numberNamesR < numberOperationsR) {
                                TestingNames objectNames = new TestingNames();
                                System.out.println("The methods which are ran the most rare are: " + objectNames.returnActions());
                            } else if (numberNamesR == numberOperationsR && numberNamesR != 0 && numberOperationsR != 0) {
                                System.out.println("The methods are run the same number of times");
                            } else {
                                System.out.println("There is no ran methods till now.");
                            }
                            break;
                        }
                        case 4: {
                            System.out.println("4.Show the method which was ran the most:");
                            int numberOperationsM = options.get("TestingOperations.java");
                            int numberNamesM = options.get("TestingNames.java");
                            if (numberOperationsM > numberNamesM) {
                                TestingOperations objectOperations = new TestingOperations();
                                System.out.println("The metod which is ran the most is:" + objectOperations.returnActions());
                            } else if (numberNamesM > numberOperationsM) {
                                TestingNames objectNames = new TestingNames();
                                System.out.println("The metod which is ran the most is:" + objectNames.returnActions());
                            } else if (numberNamesM == numberOperationsM && numberNamesM != 0 && numberOperationsM != 0) {
                                System.out.println("The methods are run the same number of times");
                            } else {
                                System.out.println("There is no ran methods till now.");
                            }
                            break;
                        }

                    }

                }else{
                    working = false;
                    System.out.println("Goodbye!!!");
                }
            }
    }
    public static void returnOperations(){
        Class Test1 = TestingOperations.class;
        Method[] MasiveMethod = Test1.getDeclaredMethods();
        for (Method method : MasiveMethod) {
            if (method.isAnnotationPresent(TestAnnotation.class)) {
                try {
                    method.invoke(Test1.newInstance());
                    System.out.printf("The test function '%s'  is passed.%n", method.getName());
                } catch (Exception ex) {
                    System.out.printf("The function '%s' is failed. %s %n", method.getName(), ex.getCause());

                }
            } else if (method.isAnnotationPresent(TestNameAnnotation.class)) {

                try {
                    method.invoke(Test1.newInstance());
                    System.out.printf("The test function '%s'  is passed.%n", method.getName());
                } catch (Exception ex) {
                    System.out.printf("The function '%s' is failed. %s %n", method.getName(), ex.getCause());
                }
            }

        }
    }
    public static void resultNames(){
        Class Test1 = TestingNames.class;
        Method[] MasiveMethod = Test1.getDeclaredMethods();
        for (Method method : MasiveMethod) {
            if (method.isAnnotationPresent(TestAnnotation.class)) {
                try {
                    method.invoke(Test1.newInstance());
                    System.out.printf("The test function '%s'  is passed.%n", method.getName());
                } catch (Exception ex) {
                    System.out.printf("The function '%s' is failed. %s %n", method.getName(), ex.getCause());

                }
            } else if (method.isAnnotationPresent(TestNameAnnotation.class)) {

                try {
                    method.invoke(Test1.newInstance());
                    System.out.printf("The test function '%s'  is passed.%n", method.getName());
                } catch (Exception ex) {
                    System.out.printf("The function '%s' is failed. %s %n", method.getName(), ex.getCause());
                }
            }

        }
    }
}

