package hangManGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HangmanGameLauncher {
    public static Scanner scanner = new Scanner(System.in);
    public static int option;

    public static void main(String[] args) {


        System.out.println("****Let's Play HangMan Game****"+ "\n");
        System.out.println("Please enter your name" + "\n");
        String playerName = scanner.next();
        System.out.println("Welcome " + playerName + "!" + "\n");

        System.out.println("****Welcome to Menu driven code****");

        //menu driven template

        while (true) {
            System.out.println("\n1. Start game");
            System.out.println("2. Game Rules");
            System.out.println("3. Quit");

            System.out.println("Enter your option");
        try {
            option = scanner.nextInt();//accept user input
         }catch (InputMismatchException e){
             }
            switch (option) {
                case 1: game(); break;
                case 2: gameRules(); break;
                case 3:
                    System.out.println("Exiting Game");
                    System.exit(0);
                default:
                    System.out.println("Incorrect input!!! Please re-enter choice from our menu");
                }
        }
        }
    private static void game() {
            do {
                System.out.println("***WordChoce***");
                System.out.println("1. Sports Words");
                System.out.println("2. Movie Words");
                System.out.println("3. Cancel");

                System.out.println("*****Enter your word of choice****");
                int choice = scanner.nextInt();//accept user input

                switch (choice) {
                    case 1:
                        Game game1 = new SportsWords();
                        for(int level = 1; level <= 5; level ++) {
                            System.out.println("You are at level : " + level);
                            game1.playGameWithSelecteCatagory();
                        }
                        System.out.println("You Won!!");
                        break;
                    case 2:
                        Game game2 = new MovieWords();
                        for(int level = 1; level <= 5; level ++) {
                            System.out.println("You are at level : " + level);
                            game2.playGameWithSelecteCatagory();
                        }
                        System.out.println("You Won!!");

                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("***ERROR: Invalid input!***");
                        break;
                }
            }while (true);
        }

        public static void gameRules(){
            System.out.println("              Game Rules     ");
            System.out.println("You will be given a word to try and guess.");
            System.out.println("Your number of tries will be 10.");
            System.out.println("There are 5 levels in this game.");
            System.out.println(" If you chhose correct words in 5 level you will win ");
            System.out.println("Goodluck; Have fun!");
            System.out.println("              Game Rules      ");
        }

}
