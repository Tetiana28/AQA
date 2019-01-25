package com.globallogic.aqa;

public class Task1 {
    public static void main(String[] args) {
        int varInt = 24234234;
        System.out.println("int: "+varInt);
        double varDouble ;
        String varString ;
        varString = String.valueOf(varInt);
        System.out.println(varString);
        String newf = Integer.toString(varInt);
        System.out.println(newf);
        varDouble = Double.parseDouble(varString);
        System.out.println(varDouble);
        varInt= (int) varDouble;
        System.out.println(varInt);


    }
}
