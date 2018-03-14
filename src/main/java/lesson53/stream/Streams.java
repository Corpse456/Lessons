package lesson53.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lesson53.java8.Soldat2;

public class Streams {

    public static void main (String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        System.out.println(list);

        Stream<Integer> stream = list.stream();
        // stream.forEach((a) -> System.out.print(a + 1 + " "));
        stream = stream.map( (i) -> i + 2);
        // System.out.println(list);

        Stream<Object> strSold = stream.map( (i) -> {
            Soldat2 newSold = new Soldat2();
            newSold.id = i;
            return newSold;
        });
        strSold.forEach(System.out::println);

        // воссоздать лист солдт и из него обратно лист интеджеров
        Stream<Integer> strInt = list.stream().map( (i) -> new Soldat2())
                .peek( (s) -> s.id = (int) (Math.random() * 102)).map( (s) -> s.id);
        strInt.collect(Collectors.toList());
        strInt.forEach(System.out::println);
    }
}
