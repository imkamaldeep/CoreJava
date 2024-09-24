package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithFilter {

    public static void main(String[] args) { // Use 'args' instead of 'arg'

        // Initialize the main list of integers
        List<Integer> listMain = Arrays.asList(2, 4, 5, 6, 59, 33, 37, 79, 54, 24, 98);

        // Filter even numbers and collect them into a new list
        List<Integer> evenList = listMain.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        // Filter odd numbers and collect them into a new list
        List<Integer> oddList = listMain.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());


    }
}