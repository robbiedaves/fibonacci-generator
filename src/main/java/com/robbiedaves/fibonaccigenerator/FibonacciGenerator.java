package com.robbiedaves.fibonaccigenerator;


import java.util.*;

public class FibonacciGenerator {

    public List<Integer> generateFibonacci(int max) {
        List<Integer> seq = new ArrayList<>();
        Integer prev = 0;
        Integer next = 1;
        seq.add(prev);
        seq.add(next);

        while (next < max) {
            Integer newValue = prev + next;
            prev = next;
            next = newValue;
            if (next < max) seq.add(next);
        }
        return seq;
    }

    public static void main (String[] args) {
        FibonacciGenerator fib = new FibonacciGenerator();
        List<Integer> seq = fib.generateFibonacci(100);
        seq.forEach(num -> System.out.println(num));
    }

}
