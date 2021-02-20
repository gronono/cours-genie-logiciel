package nc.unc.cours.gl;

import java.util.Arrays;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class Faire {
    public static int scoreTwoPair(int d1, int d2, int d3, int d4, int d5) {
        var dice = Arrays.asList(d1, d2, d3, d4, d5);
        var counts = dice.stream().collect(groupingBy(identity(), counting()));
        var pairs = counts.entrySet()
                .stream()
                .filter(e -> e.getValue() >= 2)
                .map(Map.Entry::getKey)
                .collect(toList());
        if (pairs.size() >= 2) {
            return pairs.stream().mapToInt(pair -> pair * 2).sum();
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("should be 8 : " + scoreTwoPair(1, 1, 2, 3, 3));
        System.out.println("should be 0 : " + scoreTwoPair(1, 1, 2, 3, 4));
        System.out.println("should be 6 : " + scoreTwoPair(1, 1, 2, 2, 2));
    }
}
