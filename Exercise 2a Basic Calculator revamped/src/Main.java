import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EXERCISE 2a: Easy Calculator (Now with Methods)
         *
         * Use the same Calculator, we've made in Exercise 1a and remake it with methods!
         * In addition, make it so that the calculator asks if you'd like to continue, you can then say "y" if you do!
         * Think how this "infinite" loop could be made! (Hint: Lesson Loops)
         *
         * Estimated Time: 30-45 minutes
         */

        // Intro
        System.out.println("Welcome to Kelv's revamped calculator!");

        // Main Loop
        boolean keepRunning = true;
        String response = " ";
        while(keepRunning){
            calculator();
            System.out.println("Would you like to do more math? (y/n)");
            Scanner scanner = new Scanner(System.in);
            response = scanner.next();
            if(response.equals("n")){
                keepRunning = false;
            }
        System.out.println("See you next time!");
        }
    }

    public static void calculator(){
        // List variables
        int intOne = 0;
        int intTwo = 0;
        String operator = " ";

        // Collect user operator and ints
        System.out.println("What operator would you like to use? (+, -, *, /)");
        Scanner scanner = new Scanner(System.in);
        operator = scanner.next();
        System.out.println("What is your first number?");
        intOne = scanner.nextInt();
        System.out.println("What is your second number?");
        intTwo = scanner.nextInt();

        // Call operator methods
        switch(operator){
            case "+": addition(intOne, intTwo); break;
            case "-": subtraction(intOne, intTwo); break;
            case "*": multiplication(intOne, intTwo); break;
            case "/": division(intOne, intTwo); break;
        }
        return;
    }

    // Addition method
    public static int addition(int x, int y) {
        System.out.println(x + " + " + y + " = " + (x+y));
        return x + y;
    }

    // Subtraction method
    public static int subtraction(int x, int y) {
        System.out.println(x + " - " + y + " = " + (x-y));
        return x - y;
    }

    // Multiplication method
    public static int multiplication(int x, int y) {
        System.out.println(x + " * " + y + " = " + (x*y));
        return x * y;
    }

    // Division method
    public static int division(int x, int y) {
        System.out.println(x + " / " + y + " = " + (x/y));
        return x / y;
    }
}
