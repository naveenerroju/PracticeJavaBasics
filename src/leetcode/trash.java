package leetcode;

import java.util.Arrays;

public class trash {
    public static void main(String[] args) {
        String[] str = {"hello", "hell no", "hella"};
        int[] sizes = new int[str.length];
        for (int i=0;i<str.length;i++){
            sizes[i]=str[i].length();
        }
        int smallestString = 0;
        for (int i=0; i<sizes.length-1;i++){
            if (sizes[i]>sizes[i+1]){
                smallestString=sizes[i+1];
            }
        }
        String comPrefix = "";
        for (int i=0; i<str.length;i++){
            for (int j=0;j<smallestString-2;j++){
                if (str[i+1].charAt(j)==str[i].charAt(j)){
                    System.out.println("z");
                    comPrefix=comPrefix+str[i].charAt(j);
                }
                else{
                    System.out.println(comPrefix);
                    break;
                }
            }
        }
        System.out.println(comPrefix);
    }
}
