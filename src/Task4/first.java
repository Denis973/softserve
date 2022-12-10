package Task4;

import java.util.ArrayList;

public class first {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list.stream().filter(x -> x % 2 != 0 && x % 5 == 0).mapToInt(a -> a).average());
    }
}
