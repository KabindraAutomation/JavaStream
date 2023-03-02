package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberStartWith {
    public static void main(String[] args) {
        //WAP to display only number started with 2
     List<Integer> list = Arrays.asList(2,33,345, -222,234,555,666, 890);
     List<Integer> numberWith2 =  list.stream().map(e-> String.valueOf(e))
                .filter(e->e.startsWith("2"))
                .map(e->String.valueOf(e))  //Map with string( element convert into String
                .filter(e->e.startsWith("8") || e.startsWith("-2")) // it will filter by starting char with 2
                .map(Integer::valueOf)// wrapper class, using method expression
                .collect(Collectors.toList());
        System.out.println(numberWith2);


    }
}
