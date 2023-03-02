package Stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 11,2,3,45,55,58,80);

        //even number
        List<Integer> evenList = list.stream().filter(e ->e%2==0).collect(Collectors.toList());
        System.out.println("List of even number from Array List : "+ evenList);

        //Odd number
        List<Integer> OddList = list.stream().filter(e ->e%2!=0).collect(Collectors.toList());
        System.out.println("List of Odd number from Array List : "+ OddList);


    }
}
