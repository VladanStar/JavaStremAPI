package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> lista =  Arrays.asList("a1","a2","a3","b1","b2","b3","c1","c2","c3");
        lista
                .stream()
                .filter(s->s.startsWith("b"))
                .map(String::toUpperCase)
                .sorted()
                 .forEach(System.out.println());

    }
}
