package Task4;

import java.util.ArrayList;

public class fourth {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        StringBuilder rez = new StringBuilder();
        arrayList.stream().forEach(x -> rez.append(Integer.toString(x)));
        System.out.println(rez);
    }
}
