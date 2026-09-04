import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EXERCISE 2b: Basic Resource Miner Game (Now with methods)
         * We will refactor (rewrite) the Classic Resource Miner Game with Methods. This will CLEAN IT UP significantly!
         *
         * With this, change it to so the User can input how many blocks they want to harvest before the game ends!
         *
         * Estimated Time ~60+ minutes
         */

        // Into
        System.out.println("Welcome to Kelv's Basic Resource Miner Game (revamped)!");
        System.out.println("Choose either a sword, shovel, or pickaxe to break the block.");

        // List variables
        boolean playAgain = true;

        // Main loop
        while(playAgain) {
            // Ask how many blocks the user wants to break
            System.out.println("How many blocks would you like to break?");
            Scanner scanner = new Scanner(System.in);
            int blockInt = scanner.nextInt();

            // Run game
            blockGame(blockInt);

            // Ask to play again
            System.out.println("Play again? (y/n)");
            String keepPlaying = scanner.next().toLowerCase();
            if(keepPlaying.equals("n")){
                playAgain = false;
            }

        System.out.println("See you next time!");

        }
    }

    // Method for running the game
    public static void blockGame(int blocks){
        int correctCount = 0;

        for(int i = 0; i < blocks; i++){
            if(generateBlock()){
                correctCount++;
            }
        }
        System.out.println("You got " + correctCount + " out of " + blocks + " blocks correct.");
        return;
    }

    //Method for generating blocks
    public static boolean generateBlock(){
        // List Variables
        boolean correct = true;
        String blockName = " ";
        String tool = "hoe";
        int toolInt = 0;

        // Provided random number generator
        int min = 1;
        int max = 3;
        int randomBlock = (int) (Math.random() * (max - min + 1)) + min;

        if(randomBlock == 1){
            blockName = "Cobweb";
        }else if(randomBlock == 2){
            blockName = "Clay";
        }else if(randomBlock == 3){
            blockName = "Stone";
        }

        System.out.println(blockName + " block: Choose your tool.");
        Scanner scanner = new Scanner(System.in);
        tool = scanner.next().toLowerCase();

        if(tool.equals("sword")){
            toolInt = 1;
        }else if(tool.equals("shovel")){
            toolInt = 2;
        }else if(tool.equals("pickaxe")){
            toolInt = 3;
        }

        if(randomBlock == toolInt){
            correct = true;
            System.out.println("Correct!");
        }else{
            correct = false;
            System.out.println("Wrong!");
        }

        if(correct){
            return true;
        }else{
            return false;
        }
    }
}