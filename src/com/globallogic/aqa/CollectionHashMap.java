package com.globallogic.aqa;
import java.util.*;

public class CollectionHashMap {
    public static void main(String[] args) {
        HashMap<String, Object > map = new HashMap<>();

        map.put("Test",7);
        map.put("Class", 4.5);
        map.put("Cat", true);
        map.put("Dog", null);
        map.put("Bird", "Cat");
        map.put("Something", String.valueOf(new Long(83)));
        map.put("Mail", new Character('8'));
        map.put("Tab", '2');
        map.put("Browser", 22222222222L);
        map.put("IDE", (double) 489);

        for (Map.Entry<String, Object> stringStringEntry : map.entrySet()) {
            System.out.println("This is a key - " + stringStringEntry.getKey()
                    + " and this is a value - " + stringStringEntry.getValue());
        }

    }
}