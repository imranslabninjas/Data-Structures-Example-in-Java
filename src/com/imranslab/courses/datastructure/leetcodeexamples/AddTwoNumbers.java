package com.imranslab.courses.datastructure.leetcodeexamples;

/*
* You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
* and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
* https://leetcode.com/problems/add-two-numbers/
* */

import java.util.LinkedList;

public class AddTwoNumbers
{
    public static void main(String[] args)
    {
        // Inorder Integer List
        Integer[] list_1 = new Integer[]{3, 4, 2};
        Integer[] list_2 = new Integer[]{4, 6, 5};

        // Reverse Ordered Linked List
        LinkedList<Integer> list1 = getLinkedListReverseOrderedFromIntegerArray(list_1);
        LinkedList<Integer> list2 = getLinkedListReverseOrderedFromIntegerArray(list_2);

        System.out.println(list1);
        System.out.println(list2);

        // Putting the List back in order
        LinkedList<Integer> list_1_reversed = reverseLinkedList(list1);
        LinkedList<Integer> list_2_reversed = reverseLinkedList(list2);

        // Print Reverse ordered List
        System.out.println(list_1_reversed);
        System.out.println(list_2_reversed);
    }

    // Reverse the list in a linked list data structure
    private static LinkedList<Integer> getLinkedListReverseOrderedFromIntegerArray(Integer[] number)
    {
        LinkedList<Integer> list = new LinkedList<>();
        for (Integer integer : number) {
            list.addFirst(integer);
        }
        return list;
    }

    private static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> givenList)
    {
        LinkedList<Integer> list = new LinkedList<>();
        while(givenList.size()!=0)
        {
            list.addFirst(givenList.pollLast());
        }
        return list;
    }
}
