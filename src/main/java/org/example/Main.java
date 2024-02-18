package org.example;

import fibonacci.DynamicFibonacci;
import fibonacci.IterativeFibonacci;
import fibonacci.RecurciveFibonacci;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ){
        IterativeFibonacci iterativeFibonacci = new IterativeFibonacci();
        int number = 4;
        System.out.println("Iterative fibonacci: ");
        System.out.println(iterativeFibonacci.iterativeFibonacci(number));

        RecurciveFibonacci recurciveFibonacci = new RecurciveFibonacci();
        System.out.println("Recurcive fibonacci: ");
        System.out.println(recurciveFibonacci.recursiveFibonacci(number));

        DynamicFibonacci dynamicFibonacci = new DynamicFibonacci();
        System.out.println("Dynamic fibonacci: ");
        System.out.println(dynamicFibonacci.dynamicFibonacci(number));
    }
}
