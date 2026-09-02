import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EXERCISE 1b: Basic Resource Miner Game
         * Create a Basic "Resource Miner" Game. This is of course open to interpretation.
         *
         * The Basic idea is as follows: Via a random number generated, the "player" has one of (at least) three "blocks"
         * in front of them. Let's call them Clay, Stone, Cobweb as examples. The player must then decide which tool to use
         * Sword, Shovel, Pickaxe. If the correct tool chosen then the player moves onto the next randomly selected block.
         * They should mine three blocks and then the game outputs the score on how many they mined correctly!
         *
         * When the player types in their tool, make sure to do a small amount of error correction. Make sure that both
         * lower and uppercase for the tool names are basically ignored! (Lesson: String Methods)
         *
         * For ease of use this, generates a number between 1 and 3, feel free to use it:
         * int min = 1;
         * int max = 3;
         * int randomBlock = (int) (Math.random() * (max - min + 1)) + min;
         *
         * Estimated Time ~60+ minutes
         */

        // Introduction

        System.out.println("Welcome to Kelv's Resource Miner Game! Choose your tool by typing Sword, Shovel, or Pickaxe " +
                "to clear the mystery blocks (either clay, stone, or cobweb) in front of you. You get 3 trys to clear 3 blocks, " +
                "good luck!");

        // Generate Block #1

        int min = 1;                                                // Provided random number generator
        int max = 2;
        int randomBlock = (int) (Math.random() * (max - min + 1)) + min;

        String blockOne = " ";

        if(randomBlock == 1){
            blockOne = "cobweb";
        }else if(randomBlock == 2){
            blockOne = "clay";
        }else if(randomBlock == 3){
            blockOne = "stone";
        }

        // Attempt #1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Block #1: Choose your tool!");
        String chosenTool = scanner.next().toLowerCase();          // Making input lowercase

        int toolOne = 0;

        if(chosenTool.equals("sword")){                             // Converting chosen tool into number
            toolOne = 1;
        }else if(chosenTool.equals("shovel")){
            toolOne = 2;
        }else if (chosenTool.equals("pickaxe")){
            toolOne = 3;
        }

        // Compare block/tool #1 and give result

        int successCounter = 0;

        if(randomBlock == toolOne) {
            successCounter++;
            System.out.println("Success, You broke the " + blockOne + " block!");
        }else{
            System.out.println("Fail, the block was a " + blockOne + " block.");
        }

        // Generate Block #2

        randomBlock = (int) (Math.random() * (max - min + 1)) + min;

        String blockTwo = " ";

        if(randomBlock == 1){
            blockTwo = "cobweb";
        }else if(randomBlock == 2){
            blockTwo = "clay";
        }else if(randomBlock == 3) {
            blockTwo = "stone";
        }

        // Attempt #2

        scanner = new Scanner(System.in);
        System.out.println("Block #1: Choose your tool!");
        chosenTool = scanner.next().toLowerCase();          // Making input lowercase

        int toolTwo = 0;

        if(chosenTool.equals("sword")){                             // Converting chosen tool into number
            toolTwo = 1;
        }else if(chosenTool.equals("shovel")){
            toolTwo = 2;
        }else if (chosenTool.equals("pickaxe")){
            toolTwo = 3;
        }

        // Compare block/tool #2 and give result

        if(randomBlock == toolTwo) {
            successCounter++;
            System.out.println("Success, You broke the " + blockTwo + " block!");
        }else{
            System.out.println("Fail, the block was a " + blockTwo + " block.");
        }

        // Generate Block #3

        randomBlock = (int) (Math.random() * (max - min + 1)) + min;

        String blockThree = " ";

        if(randomBlock == 1){
            blockThree = "cobweb";
        }else if(randomBlock == 2){
            blockThree = "clay";
        }else if(randomBlock == 3) {
            blockThree = "stone";
        }

        // Attempt #3

        scanner = new Scanner(System.in);
        System.out.println("Block #1: Choose your tool!");
        chosenTool = scanner.next().toLowerCase();          // Making input lowercase

        int toolThree = 0;

        if(chosenTool.equals("sword")){                             // Converting chosen tool into number
            toolThree = 1;
        }else if(chosenTool.equals("shovel")){
            toolThree = 2;
        }else if (chosenTool.equals("pickaxe")){
            toolThree = 3;
        }

        // Compare block/tool #3 and give result

        if(randomBlock == toolThree) {
            successCounter++;
            System.out.println("Success, You broke the " + blockThree + " block!");
        }else{
            System.out.println("Fail, the block was a " + blockThree + " block.");
        }

        // Final Results

        System.out.println("Game Over. You got " + successCounter + " blocks correct!");
    }
}