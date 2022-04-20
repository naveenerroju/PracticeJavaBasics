package basicpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
        
    }

    //sample integer linked lists
    public static void linkedLists(){
        LinkedList linky = new LinkedList<>();
        for (int i=1;i<=100;i++){
            if (i%2==0){
                linky.add(i);
            }
        }
        System.out.println("List is "+linky);
        System.out.println("number 64 is in "+linky.indexOf(64)+"th index");

    }

    //sample hashmap
    public static void hashy(){
        List<java.io.Serializable> li = new ArrayList<>();
        li.add("hi");
        li.add(5);
        HashMap<Integer, String> hashed = new HashMap<>();
        hashed.put(1,"Naveen");
        hashed.put(2,"Bolt");
        hashed.put(3,"Love");
        System.out.println(hashed);
        System.out.println(li);
        System.out.println("class of li 1st element is "+li.get(0).getClass());
    }
}
