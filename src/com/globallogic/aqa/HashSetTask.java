package com.globallogic.aqa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class HashSetTask {
    public static void main(String[] args) {

                Set<String> fruits = new HashSet<>();
                fruits.add("pineapple");
                fruits.add("watermelon");
                fruits.add("apple");
                fruits.add("pear");
                fruits.add("quince");
                fruits.add("lemon");
                fruits.add("kiwi");

                System.out.println("The list of HashSet: " + fruits);

        ArrayList<String> fruits2 = new ArrayList<String>();
        fruits2.add("plum");
        fruits2.add("nut");
        fruits2.add("apple");
        fruits2.add("grape");
        fruits2.add("peach");
        fruits2.add("pear");
        fruits2.add("cherry");
        fruits2.add("orange");
        fruits2.add("watermelon");
        fruits2.add("apricot");
        fruits2.add("pineapple");
        System.out.println("The list of ArrayList: " + fruits2);

        //Set<String> fruits2 = new HashSet<>(fruits);
        fruits2.equals(fruits);
        //fruits.removeIf(fruits2.contains());
        System.out.println(fruits);

            }
        }
