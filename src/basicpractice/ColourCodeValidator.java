package basicpractice;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ColourCodeValidator {

    public static void main(String[] args) {

        //System.out.println(validateHexCode("#FF5733"));
        //System.out.println(validateHexCode("#842511"));
        //System.out.println(validateHexCode("#83A5E2"));

        System.out.println(validateDecimalCode("rgb(134,2,64)"));
    }

    public static int validateDecimalCode(String str){
        StringTokenizer st1 = new StringTokenizer(str,"(");
        ArrayList<String> arr = new ArrayList<>();
        while (st1.hasMoreTokens()){
            arr.add(st1.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer(arr.get(1),")");
        while (st2.hasMoreTokens()){
            arr.set(1,st2.nextToken());
        }
        System.out.println(arr.toString());

        return -1;
    }
    public static boolean decimalValidator(ArrayList arr){
        boolean valid = false;
        ArrayList<Integer> nums = new ArrayList();
        System.out.println("inside decimal validator");
        if (arr.get(0)=="rgb"){
            System.out.println("arr 0 is rgb validated");
            StringTokenizer st = new StringTokenizer(arr.get(1).toString(),",");

            while (st.hasMoreTokens()){
                nums.add(Integer.parseInt(st.nextToken()));
            }
            for(int in:nums){
                if (in<=250){
                    System.out.println("numbers are less than 250");
                    valid = true;
                }
            }
        }
        return valid;
    }

    public static int validateHexCode(String str){
        char[] c = str.toCharArray();
        char[] alphs = {'A','B','C','D','E','F'};
        if(c[0]=='#'&&c.length==7){
            if (iteratorValid(c)){
                return 1;
            }
        }
        return -1;
    }
    public static boolean iteratorValid(char[] arr){
        boolean contains = true;
        for (char el : arr){
            if (el!='A' && el!='B' && el!='C' && el!='D' && el!='E' && el!='F' &&
                    el!='0' && el!='1' && el!='2' && el!='3' && el!='4' && el!='5' && el!='6' && el!='7' && el!='8' && el!='9'
                    && el!='#'
            ){
                contains = false;
            }
        }
        return contains;
    }
}
