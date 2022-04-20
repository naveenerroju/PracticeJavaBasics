package leetcode;

import java.util.Arrays;

public class EasyExercises {
    public static void main(String[] args) {
        romanToInt("VII");
    }


    public static int[] twoSum(int[] nums, int target) {
//        Given an array of integers nums and an integer target,
//        return indices of the two numbers such that they add up to target.
        int[] result = new int[2];
        for (int i=0; i<=nums.length-1;i++){
            for (int j=0; j<= nums.length-1; j++){
                if(nums[j]+nums[i]==target && i!=j){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }
        }
        return result;
    }

    //pending
    public static int romanToInt(String str) {
        /*
        Symbol       Value
          I             1
          V             5
          X             10
          L             50
          C             100
          D             500
          M             1000
         */
        int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
        return -1;
    }
    public static String longestCommonPrefix(String[] str){
        String comPrefix = "";
        for (int i=0; i<str.length;i++){
            for (int j=0;j<str[0].length();j++){
                if (str[i].charAt(j)==str[i+1].charAt(j)){
                    comPrefix=comPrefix+str[i].charAt(j);
                }
                else{
                    return comPrefix;
                }
            }
        }
        System.out.println(comPrefix);
        return comPrefix;
    }
}
