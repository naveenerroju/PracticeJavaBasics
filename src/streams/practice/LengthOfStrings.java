package streams.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfStrings {
    public static void lengthOfStrings(List<String> input){

        //making the input stream, then using map function to get the length of every element and then collecting them to store in sizes
        List<Integer> sizes = input.stream().map(x->x.length()).collect(Collectors.toList());
        System.out.println("sizes of the elements are "+sizes);

        //Find out the elemets which are over 5 length
        List<String> bigStrings = input.stream().filter(x->x.length()>5).collect(Collectors.toList());
        System.out.println("Strings which are over 5 chars "+bigStrings);
    }

    public static void main(String[] args) {
        List<String> cities = Arrays.asList(
                "Hyderabad","Chennai","Goa","Delhi","Amritsar","Manali"
        );
        lengthOfStrings(cities);
    }
}
