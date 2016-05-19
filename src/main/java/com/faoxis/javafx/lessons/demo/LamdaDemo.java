package com.faoxis.javafx.lessons.demo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sergei on 19.05.2016.
 */
public class LamdaDemo {
    public static void main(String[] args) {
        new Thread(
                () -> {
                    System.out.println("Hello World, version 1");
                    System.out.println("Making some work 1");
                    System.out.println("It's Thread 1");
                }
        ).start();

        new Thread(
                () -> {
                    System.out.println("Hello World, version 2");
                    System.out.println("Making some work 2");
                    System.out.println("It's Thread 2");
                }
        ).run();

    }

}
