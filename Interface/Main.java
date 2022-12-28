package Interface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
//        Child child = new Child("janak");
//        child.eat();
//        child.sleep();
//        child.play();
//        Parent.reading();

        List<Integer> str = Arrays.asList(1,2,34,5);
        List<Integer> list = str.stream().filter(e -> e > 5).toList();

        System.out.println(list);

        str.stream().map(e -> e * 5).forEach(System.out::println);
    }
}
