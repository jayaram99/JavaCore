package lamdas.demo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // To use the Operation interface
        // we should have an Implementation class for it
        // Then we can create the impl object and use that method

        // instead of that we can go for anonymous class and land into the concept of lamda

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
    }
}
