package test;
import java.util.Scanner;
public class menu2 {
    //create two objects of Word class and WordBank class.
//WordBank wordbank;
//Word word;
////take user input for wordType
//(gameInput == 1)
//wordbak = new SportsWords;
//randomWord = workbank.getRandomWord();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("::Welcome to Menu driven code::");

        //menu driven template
        while (true) {
            System.out.println("\n1. Start game");
            System.out.println("2. Game Rules");
            System.out.println("3. Quit");

            System.out.println("Enter your option");
            int option = scan.nextInt();//accept user input

            switch (option) {
                case 1:
                    System.out.println("I am case 1");
                    //method call or logic for case 1
                    break;
                case 2:
                    System.out.println("I am case 2");
                    //method call or logic for case 2
                    break;
                case 9:
                    System.out.println("Exiting the application");
                    System.exit(0);
                default:
                    System.out.println("Incorrect input!!! Please re-enter choice from our menu");
            }
        }
    }
}
