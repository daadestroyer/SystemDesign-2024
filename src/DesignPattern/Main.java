package DesignPattern;

import java.util.random.RandomGenerator;

record Point(int x, int y) {

}

public class Main {
    public static void main(String[] args) {
        RandomGenerator rng = RandomGenerator.getDefault(); // default PRNG
        System.out.println("Random int: " + rng.nextInt()); // Random int: 715378305
        System.out.println("Random int (0–99): " + rng.nextInt(100)); // Random int (0–99): 36
        System.out.println("Random double: " + rng.nextDouble()); // Random double: 0.32243344415714614
    }
}


