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
        Integer[] list_1 = new Integer[]{3, 4, 2};
        Integer[] list_2 = new Integer[]{4, 6, 5};

        LinkedList list1 = getLinkedListReverseOrderedFromIntegerArray(list_1);
        LinkedList list2 = getLinkedListReverseOrderedFromIntegerArray(list_2);

        System.out.println(list1);
        System.out.println(list2);
    }

    private static LinkedList<Integer> getLinkedListReverseOrderedFromIntegerArray(Integer[] number)
    {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i<number.length; i++)
        {
            list.addLast(number[i]);
        }
        return list;
    }
}
