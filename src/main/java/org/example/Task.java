package org.example;

//ToDo: Write a method that will return the factorial of the input number

public class Task {
    public int factorial(int input) {
        //write your solution here
        int factorialResult = 1;
        for(int i = 1; i <= input; i++){
            factorialResult *= i;
        }
        return factorialResult;
    }
}
