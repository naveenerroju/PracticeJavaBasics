package leetcode;
//incomplete program. this throws indexoutofboundexception
import java.util.LinkedList;

//Palindrome words: BIB, NUN, RACECAR, CIVIC, DEIFIED, HANNAH, LEVEL, MOM, NOON, MINIM, ROTATOR, PEEP, SALAS, PIP, POP, REDDER, KAYAK, TENET, WOW
public class PalindromeLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        int half;
        if (list.size()%2==0){
            half = list.size()/2;
        } else {
            half = (list.size()/2)+1;
        }

        boolean isPalindrome = true;
        System.out.println(list);
        for (int i = 0; i< half;i++){
            if(list.get(i)!=list.get(list.size()-i)){
                isPalindrome = false;
            }
        }
        if (isPalindrome) System.out.println("It is a palindrome");
        else System.out.println("Not a palindrome");
    }
}
