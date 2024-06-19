package lamdas.demo3;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // Traditional way of using user defined functional interface
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = scanner.nextInt();
        Operation operation = new Operation()
        //Anonymous inner class
        {
            @Override
            public boolean isPositive(int a) {
              return a>=0;
            }
        };

        System.out.println(operation.isPositive(n));

        // Method 2 Lambdas
        // Structure of lambda:
            // input -> what has to be returned i.e the operation to be performed or condn to be checked

        //Lambda function
        Operation operation1 = a -> a>=0;
        System.out.println(operation1.isPositive(n));


        // To use the Operation interface
        // we should have an Interface for it
        // But Java provides in built functional interfaces
        int n1 = 1;
        // 1. Function<Input Type, Return Type>
        // Use the function apply() provided in that interface after writing our lambda expr
        // So we don't have to create an interface like Operation
        Function<Integer,Boolean> operation2 = a -> a>=0;
        System.out.println(operation2.apply(n1));

        // 2. Predicate<Input Type>
        // Use the function test() provided in that interface after writing our lambda expr
        int n2 = -1;
        Predicate<Integer> predicate = a -> a>=0;
        System.out.println(predicate.test(n2));
    }
}
