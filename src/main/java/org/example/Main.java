package org.example;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main (String[] arg){
        Task01 task01 = new Task01();
        task01.setStringToReverse("hello");
        System.out.println(task01.getStringToReverse());
        task01.reserveString();
        System.out.println(task01.getStringToReverse());
        System.out.println();

        //
        LongestWord longestWordFinder = new LongestWord();
        List<String> longestWords = longestWordFinder.findLongestWords("moye moye mo");
        System.out.println("Longest word(s): " + longestWords);
        System.out.println();

        //
        List<String> strings = Arrays.asList("kitty", "hello");
        checkDuplicate(strings);

        //
        List<Integer> sortedList = List.of(1, 2, 2, 3, 4, 4, 5,666658);
        remover(sortedList);
    }


    public static void checkDuplicate(List<String> strings){
        CheckDuplicate checker = new CheckDuplicate();
        boolean containsDuplicates = checker.hasDuplicates(strings);
        if (containsDuplicates) {
            System.out.println("The list contains duplicates.");
            System.out.println();
        } else {
            System.out.println("The list does not contain duplicates.");
            System.out.println();
        }
    }
    public static void remover(List<Integer> sortedList){
        RemoveDuplicates remover = new RemoveDuplicates();
        List<Integer> listWithoutDuplicates = remover.removeDuplicatesFromSortedList(sortedList);
        System.out.println("List without duplicates: " + listWithoutDuplicates);
    }
}

