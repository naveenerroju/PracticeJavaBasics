package basicpractice;

import java.util.concurrent.LinkedBlockingDeque;

//This class contains the practice of data structures and algorithms
public class Tree {
    public static void main(String[] args) {
        int[] array = {10,20,22,60,110,610,1000};
        System.out.println(binarySearch(60, array));
    }
    public static int linearSearch(int key,int[] input){
        int def = -1;
        for (int i=0;i<=input.length-1;i++){
            if (input[i]==key){
                return i;
            }
        }
        return def;
    }

    public static int binarySearch(int key, int[] input){
        //NOTE: binary search can only be done in sorted list.
        int low = 0;
        int high = input.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if (key>input[mid]){
                low =mid+1;
            }
            else if (key==input[mid]){
                    return mid;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

}
