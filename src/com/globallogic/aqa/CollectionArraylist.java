package com.globallogic.aqa;

import java.util.*;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionArraylist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        System.out.println("ArrayList Before Reverse :");
        System.out.println(list);

        Collections.reverse(list);

        System.out.println("ArrayList After Reverse :");

        System.out.println(list);
}}
