package streams.practice;

import oopsPractice.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.sound.sampled.SourceDataLine;

public class StreamsPracticeOne {

    
    public static void main(String[] args) {
        int limit =100;
        List<Integer> list1 = new ArrayList<>();
        for (int i=1;i<=100;i++){
            list1.add(i);
        }
        //System.out.println(list1);

        list1 = list1.stream().filter(e->e%2==0).
                limit(10).
                collect(Collectors.toList()
            );
        System.out.println(list1);

        List<Double> halfs = list1.stream().map(e->(double)e/3).collect(Collectors.toList());
        //System.out.println(halfs);

    
        
    }
}
