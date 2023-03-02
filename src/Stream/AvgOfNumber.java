package Stream;

import java.util.*;

public class AvgOfNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, -11, 2,55,6);
        double avg  = list.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println(avg);

    }
}
