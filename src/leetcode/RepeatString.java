package leetcode;

import java.io.InputStreamReader;

public class RepeatString {
    public static void main(String[] args) {
        String mystr = "abcac";
        int len = 20;
        int count  = 0;
        char ch = 'a';
        int numberOfChars = 0;
        StringBuffer repeated =new StringBuffer(mystr);
        while(repeated.length()<len){
            repeated.append(mystr);
            count++;
        }
        for (int i = 0;i< repeated.length();i++){
            if(repeated.charAt(i)==ch){
                numberOfChars++;
            }
        }
        System.out.println(repeated);
        System.out.println("number of operations: "+count);
        System.out.println(ch+" occured "+numberOfChars+" times in the repeated string");
    }
}
