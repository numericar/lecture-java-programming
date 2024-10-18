package L27_stream;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // Wrapper class of primitive type stream
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 0);

        Stream<Integer> integerStream = integers.stream();
        Stream<Integer> multiply2Stream = integerStream.map(n -> n * 2);
        Stream<Integer> filterModTen = multiply2Stream.filter(n -> n % 10 == 0);
        
        List<Integer> results = filterModTen.collect(Collectors.toList()); // แปลงข้อมูลใน stream ให้อยู่ในรูปแบบของ collection
    
        System.out.println(results);

        // Alternative
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 0);
        System.out.println(intStream.average().getAsDouble());


        Stream<String> fruitStream = Stream.of("apple", "banana", "melon", "lemon", "Apple");
        var countFrequency = fruitStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countFrequency);
    }
}
