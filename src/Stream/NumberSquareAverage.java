package Stream;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,10,20,30,15);
        //1 100 400 900 225 (e *e
        //400 900 225
        //1525/3 = 508.33
        double squareAvg = list.stream()
                .map(e ->e * e)
                .filter(e -> e> 100)
                .mapToInt(e ->e).average().getAsDouble();
        System.out.println(squareAvg);
    }

}
