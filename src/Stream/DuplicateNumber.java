package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,10,20,15,1,45,45,65,3,15);
        //using frequency concept
//       Set<Integer> dupNum;
//        dupNum = list.stream().filter(e -> Collections.frequency(list, e)>1).collect(Collectors.toSet());
//        System.out.println("Duplicate number = "+ dupNum);

        //Using Set<>
        Set<Integer> dupNum = new HashSet<Integer>();
        Set<Integer> dup = list.stream().filter(e-> !dupNum.add(e)).collect(Collectors.toSet());
        System.out.println(dup);
    }
}
