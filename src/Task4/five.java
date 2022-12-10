package Task4;

import java.util.ArrayList;
import java.util.List;

public class five {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("Denis", "Boyko", 19));
        list.add(new Person("Alina", "Shepko", 30));
        list.add(new Person("Sergey", "Nemchik", 15));
        list.add(new Person("Vasa", "Tegro", 25));

        System.out.println(list.stream()
                .filter(x -> x.firstName.length() < 15)
                .max((x,y)->x.getAge()-y.getAge()));
    }

    public static class Person {
        public String firstName;
        public String lastName;
        public int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
        public int getAge() {
            return age;
        }
    }
}
