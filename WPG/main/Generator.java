package main;

import java.util.Random;

import student.Information;

public class Generator {
    static Random random = new Random();
    private static int bound;

    public static String getRandomName(){
        random.setSeed(System.nanoTime());
        bound = Information.getNameSize();
        return Information.getName(random.nextInt(bound));
    }

    public static String getRandomItem(){
        random.setSeed(System.nanoTime());
        bound = student.getNameSize();
        return student.Item[random.nextInt(bound)];
    }

    public static int getRandomRange(){
        random.setSeed(System.nanoTime());
        bound = student.getRange();
        return random.nextInt(bound);
    }
}
