package basicpractice;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Live your life in this moment";
        String[] arr = str.split(" ");
        String rev = "";
        for (int  i = arr.length-1;i>=0;i--){
            rev+=arr[i];
            if(i!=0){
                rev+=" ";
            }
        }
        System.out.println(rev);
    }
}
