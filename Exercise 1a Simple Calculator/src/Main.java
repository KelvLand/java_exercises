import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EXERCISE 1a: Easy Calculator
         *
         * Create a Calculator that runs once.
         * You should read the operation first, then read the first and second number.
         *
         * Depending on the operation chosen, you then have to return a different result.
         * You can do this with if statements or a switch statement.
         *
         * REMEMBER: that when reading in a String, you want to use scanner.next()
         * And when comparing strings you wanna use:
         * String s = "something";
         * s.equals("something"); and not ==
         *
         * After the result has been output the program ends!
         * Estimated Time: 30-45 minutes
         */

        //Collect operator

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Kelv's Calculator! What operator do you want to use? (+, -, *, /)");
        String operator = scanner.next();

        //Collect first and second numbers

        System.out.println("What is your first number?");
        int numberOne = scanner.nextInt();

        System.out.println("What is your second number?");
        int numberTwo = scanner.nextInt();

        //Solve and print

        /* if(operator.equals("+")){
            int addResult = numberOne + numberTwo;
            System.out.println(numberOne + " + " + numberTwo + " = " + addResult);
        }else if(operator.equals("-")){
            int subResult = numberOne - numberTwo;
            System.out.println(numberOne + " - " + numberTwo + " = " + subResult);
        }else if(operator.equals("*")){
            int multResult = numberOne * numberTwo;
            System.out.println(numberOne + " * " + numberTwo + " = " + multResult);
        }else if(operator.equals("/")){
            int divResult = numberOne / numberTwo;
            System.out.println(numberOne + " / " + numberTwo + " = " + divResult);
        } */

        switch(operator){
            case "+": int addResult = numberOne + numberTwo;
            System.out.println(numberOne + " + " + numberTwo + " = " + addResult); break;
            case "-": int subResult = numberOne - numberTwo;
            System.out.println(numberOne + " - " + numberTwo + " = " + subResult); break;
            case "*": int multResult = numberOne * numberTwo;
            System.out.println(numberOne + " * " + numberTwo + " = " + multResult); break;
            case "/": int divResult = numberOne / numberTwo;
            System.out.println(numberOne + " / " + numberTwo + " = " + divResult); break;
        }
    }
}