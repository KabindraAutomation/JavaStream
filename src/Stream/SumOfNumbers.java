package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
    public static void main(String[] args) {

        //Using Arrays
        List<Integer> list = Arrays.asList(1, 11, 2);
        Optional<Integer> sum = list.stream().reduce((a, b)-> a+b);
        System.out.println("Sum of number listed on Array :" + sum.get());

        //Using ArrayList
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(22);
        list1.add(22);
        Optional Sum = list1.stream().reduce((a, b)->a+b);
        System.out.println("Sum of number :" + Sum.get());
    }



}
