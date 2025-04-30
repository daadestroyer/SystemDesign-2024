package DesignPattern;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class User{
    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        List<Integer> numbers = Arrays.asList(1, 10, 20, 1, 22, 20, 4, 5, 50, 5);

        Map<String, Long> collect = names.stream().filter(no->Collections.frequency(names,no)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<Integer, Long> collect1 = numbers.stream().filter(no->Collections.frequency(numbers,no)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(collect); //  {AA=2}
        System.out.println(collect1); // {1=2, 20=2, 5=2}





    }
}