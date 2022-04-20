package basicpractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class TestMain{
    public static void main(String[] args) {
        int a=5 , b=6, c=7;
        System.out.println("Value is "+ b + c);
        System.out.println(a + b + c);
        System.out.println("String " + (b+c));
    }

    public static  void printHollowRectangle(int height, int bredth){
        for (int i=1;i<=height;i++){
            for (int j=1;j<=bredth;j++){
                if (i==height||i==1||j==1||j==bredth){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printRectangle(int height, int breadth){
        for (int i=1;i<=height;i++){
            for (int j = 1;j<=breadth;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
