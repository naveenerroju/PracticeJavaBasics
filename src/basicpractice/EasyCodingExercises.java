package basicpractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class EasyCodingExercises extends TestMain{

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        commonPrefix(str);
    }

    public static void commonPrefix(String[] str){

        String prefix="";
        String shortest = new String();
        //finding the shortest string
        for (int i =0;i<str.length-1;i++){
            {
                if (str[i].length() < str[i + 1].length()) {
                    shortest = str[i];
                }
            }
        }
        //cropping all strings to same length
        for (int i =0;i<str.length-1;i++) {
            while (shortest.length() != str[i].length()) {
                StringBuffer sb1 = new StringBuffer(str[i]);
                sb1.deleteCharAt(str[i].length() - 1);
                //checking if execution is in while loop
                System.out.println("x");
            }
        }
        System.out.println("shortest string is "+shortest);
        System.out.println("adjusted strings are "+str);
        //checking if the strings are same, if yes, pop a char
        StringBuffer sb2 = new StringBuffer(prefix);
        for (int i = 0; i<str.length-2;i++){
            while (str[i]!=str[i+1]){
                sb2.deleteCharAt(prefix.length()-1);
            }
        }
    }

    public static int sumOfMultiples(int multiple, int num){
        /*
            this function will return the sum of multiples of int multiple to the Num.
            if multiples = 3, Num = 10:
            3, 6, 9 are the multiples of 3 till 10. so the sum of them is 18.
         */
        if (multiple<=0||num<=0) return 0;
        int sum = 0;
        for (int i=1; i<=num;i++){
            if (i%multiple==0){
                sum+=i;
            };
        }
        return sum;
    }

    public static int factorial(int num){
        int fact =1;
        for (int i=num; i>0;i--){
            fact*=i;
        }
        return fact;
    }

    public static String reverseString(String str){
        String reverse = "";
        for (int i=str.length()-1;i>=0; i--){
            reverse=reverse+str.charAt(i);
        }
        return reverse;
    }

    public static int maximumOf(int... nums){
        //takes unlimited ints as arguments and stores as array then returns the maximum value.
        int max=nums[0];
        for (int i=0; i<=nums.length-2;i++){
            if (nums[i]>max) {
                max=nums[i];
            }
        }
        return max;
    }

    public static String toUpper(String str){
        //converts the given string into uppercase without using direct String class's uppercase function
        String upper="";
        for (int i=0;i<str.length();i++){
            char j=str.charAt(i);
            upper+=Character.toUpperCase(j);
        }
        return upper;
    }

    public static int atOddIndex(int ind, int... nums){
        int count =0;
        for (int i=0;i<=nums.length-1;i++){
            if (nums[i]%2!=0){
                count++;
                if (count==ind+1){
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public static boolean isPalindrome(int input){
        int n=input,rev=0;
        while(n!=0){
            rev = rev*10+n%10;
            n = n/10;
        }
        if (input==rev) return true;
        else return false;
    }

    public static int[] bubbleSort(int...input){
        System.out.println("Raw array "+Arrays.toString(input));
        for (int j=0; j<input.length;j++) {
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i]>input[i+1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                }
            }
        }
        System.out.println("After sorting "+Arrays.toString(input));
        return input;
    }

    public static int sqrt(int input){
        //we are not allowed to use pow or any other built in functions
        int sqrt = -1;
        if (input > 0){
            for (int i=0;i<input;i++){
                if (i*i==input){
                    sqrt = i;
                }
            }
        }
        return sqrt;
    }
}

