package basicpractice;

import java.util.Base64;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BasicOperations extends Base {
    int a;
    public static void main(String[] args) {
        //Base b = new Base();
        Base bo = new BasicOperations(); //creating object of a subclass using superclass
        //System.out.println(a);  --error
        int Java = 10;

        //size reassigning works. it will simply allocate a new array to existing arr.
        int[] arr = new int[5];
        arr = new int[6];
        for (int e : arr){
            System.out.print(e+" ");
        }

            String input = "Hello Welcome";
            String pattern = "\\sHello\\sWelcome\\s";
            boolean flag = Pattern.matches(pattern, input);
            System.out.println(flag);

        final int i;
        i = 20;
        System.out.println(i);


        int x =5;
        x *= 3 + 7;
        System.out.println(x);

        //method overloading with different datatype args, but could be applied to all.
        methodA(5);
        methodB(5.2);
    }
    public static void trickyBasics(){

        int a=5 , b=6, c=7;
        System.out.println("Value is "+ b + c);
        System.out.println(a + b + c);
        System.out.println("String " + (b+c));

        //comparing two strings
        String str1 = new String( "hello" );
        String str2 = "hello";
        if  (str1==str2)
            System.out.println( "Equals");
        else
            System.out.println( "Not Equal");
    }
    static void methodA(short s) {
        System.out.println("methodA(short) called");
    }
    static void methodA(int i) {
        System.out.println("methodA(int) called");
    }
    static void methodB(float f) {
        System.out.println("methodB(float) called");
    }
    static void methodB(double d) {
        System.out.println("methodB(double) called");
    }

}

class Base{
    int a = 0;
    Base(){
        System.out.println("HI");
    }
}