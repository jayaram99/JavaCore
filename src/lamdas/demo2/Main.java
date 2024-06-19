package lamdas.demo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // To use the Print interface
        // we should have an Implementation class for it
        // Then we can create the impl object and use that method

        // instead of that we can go for anonymous class and land into the concept of lamda

        Print print = new Print()
        //Anonymous inner class
        {
            @Override
            public void hi() {
             System.out.println("Hello World");
            }
        };
        print.hi();

        // Method 2 Lambdas
        // Structure of lambda:
            // input -> what has to be returned i.e the operation to be performed or condn to be checked

        //Lambda function
        Print print1 = () -> System.out.println("hello world");
        print1.hi();
    }
}
