package streams.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain {
    public static void main(String[] args) {
        Stream<Object> emptyStream = Stream.empty();

        String name[] = {"Naveen", "Kumar", "Dandelions","Robert Frost"};
        Stream<String> namesStream = Stream.of(name);

        namesStream.forEach(e-> System.out.println(e));

        Stream<Integer> ints = Stream.of(new Integer[]{2,5,1,89,43,7,21});
        ints.forEach(e-> System.out.println(e));

        String myName = name[0];
        System.out.println(myName.startsWith("K"));
    }
}
