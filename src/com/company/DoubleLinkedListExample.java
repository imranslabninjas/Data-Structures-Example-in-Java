package com.company;

import java.util.LinkedList;

public class DoubleLinkedListExample {

    public static void main(String[] args) {
        // Test new branch
        LinkedList<String> doubleLinkedListExample = getStrings();

        System.out.println(doubleLinkedListExample);
    }

    static LinkedList<String> getStrings() {
        LinkedList<String> doubleLinkedListExample = new LinkedList<>();

        doubleLinkedListExample.add("Mercury");
        doubleLinkedListExample.add("Venus");
        doubleLinkedListExample.add("Earth");
        doubleLinkedListExample.add("Mars");
        doubleLinkedListExample.add("Jupiter");
        doubleLinkedListExample.add("Saturn");
        doubleLinkedListExample.add("Neptune");
        doubleLinkedListExample.add("Pluto");
        return doubleLinkedListExample;
    }
}