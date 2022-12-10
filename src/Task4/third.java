package Task4;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class third {
    public static void main(String[] args) {
        Map<String, Integer> first = new HashMap<>();
        first.put("qweerrt", 45);
        first.put("qazwsx", 98);
        first.put("edercrfv", 56);
        first.put("tgbyhn", 23);
        first.put("ijnuerhb", 11);
        first.put("rfvtgb", 1);

        Integer sum = first.entrySet().stream()
                .filter(x -> x.getKey().length() < 7)
                .flatMapToInt(n -> IntStream.of(n.getValue()))
                .sum();
        System.out.println(sum);

    }
}
