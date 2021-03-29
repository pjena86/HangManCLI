package hangManGame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MovieWords extends WordBank1 implements Game {
    private String[] moviesWords = new String[9];
    public static String foundWord;
    public static int level;
    public static int index;
    public static int numOfTriesLefts;
    public static char[] displayChar;
    public int numIncorrectGuesses = 0;
    public static Scanner scanner = new Scanner(System.in);
    public static String randomWordToGuess1;


    public MovieWords() {
    }

    public MovieWords(String[] moviesWords) {
        this.moviesWords = moviesWords;
    }

    public String[] getMoviesWords() {
        return moviesWords;
    }

    public void setMoviesWords(String[] moviesWords) {
        this.moviesWords = moviesWords;
    }

    @Override
    public String[] initializeWordBank() {
        moviesWords[0] = "Avengers";
        moviesWords[1] = "The Mummy";
        moviesWords[2] = "Notebook";
        moviesWords[3] = "Inception";
        moviesWords[4] = "Sherloc Home";
        moviesWords[5] = "Ludo";
        moviesWords[6] = "Queen";
        moviesWords[7] = "Pink Panther";
        moviesWords[8] = "DDLJ";

        return moviesWords;
    }

    @Override
    public void playGameWithSelecteCatagory() {

        //Generate a Random word from the movie Category
        MovieWords mw = new MovieWords();
        String[] mWords = mw.initializeWordBank();
        Random rn = new Random();
        int index = rn.nextInt(mWords.length);

        //convert Random Words to Dashes
        randomWordToGuess1 = mWords[index].toLowerCase();
        for (int i = 0; i < randomWordToGuess1.length(); i++) {
            int wordLength = randomWordToGuess1.length();
            displayChar = new char[wordLength];
            for (int j = 0; j < randomWordToGuess1.length(); j++) {
                if (randomWordToGuess1.charAt(j) == ' ') {
                    displayChar[j] = ' ';
                    System.out.print(" ");
                } else {
                    displayChar[j] = '_';
                    System.out.print("_ ");
                }
            }
            System.out.println("\nRandom Word: " + randomWordToGuess1);


//            do {
            Boolean continueGame = true;
            int availableLives = 0;
            boolean wordIsGuessed = false;
//                System.out.println("You are currently on level: " + level);

            //Letter Bank Character Array containing 26 chars
            char letterArray[] = "abcdefghijklmnopqrstuvxwyz".toCharArray();
            for (int y = 0; y < letterArray.length; y++) {
                System.out.print(letterArray[y] + " ");
            }

            int len = randomWordToGuess1.length();
            boolean letterFound;

            while (continueGame) {
                letterFound = false;
                index = 0;

                System.out.print("\nGuess a letter: ");
                Scanner scanner = new Scanner(System.in);
                char letter = '0';
                try {
                    letter = scanner.next().toLowerCase().charAt(0);
                } catch (InputMismatchException e) {
                    System.out.println("Enter a character only");
                }

                //Letter is present in the letter bank array

                char temp1 = letter;
                for (int y = 0; y < letterArray.length; y++) {
                    if (letterArray[y] == temp1) {
                        letterFound = true;
                        index = y;
                        break;
                    } else {
                        letterFound = false;
                    }
                }
                //Incorrect Guess(remove letter) or invalid Guess and replace the letter with #
                if (letterFound) {
                    letterArray[index] = '#';
                } else {
                    System.out.print("Char is already chosen");
                }

                //If the random word contains the letter that user entered
                for (int y = 0; y < letterArray.length; y++) {
                    System.out.print(letterArray[y] + " ");
                }


                String str = String.valueOf(letter);
                if (randomWordToGuess1.contains(str)) {
                    for (int y = 0; y < len; y++) {
                        if (randomWordToGuess1.charAt(y) == letter) {
                            displayChar[y] = letter;
                            System.out.println("\nYou have chosen a correct letter");
                            if (randomWordToGuess1.equalsIgnoreCase(String.valueOf(displayChar))) {
                                return;
                            }
                        }
                    }
                    System.out.println(displayChar);
                } else {

                    availableLives++;
                    System.out.println("You have chosen an incorrect letter");
                    System.out.println("Chances left " + (10 - availableLives));

                    if (availableLives == 10) {
                        System.out.println("You have lost the game");
                        System.exit(0);
                    }

                    HangmanImage hangmanImage = new HangmanImage();
                    switch (availableLives) {
                        case 1:
                            hangmanImage.man1();
                            break;
                        case 2:
                            hangmanImage.man2();
                            break;
                        case 3:
                            hangmanImage.man3();
                            break;
                        case 4:
                            hangmanImage.man4();
                            break;
                        case 5:
                            hangmanImage.man5();
                            break;
                        case 6:
                            hangmanImage.man6();
                            break;
                        case 7:
                            hangmanImage.man7();
                            break;
                        case 8:
                            hangmanImage.man8();
                            break;
                        case 9:
                            hangmanImage.man9();
                            break;
                        case 10:
                            HangmanImage.man10();
                            break;
                        default:
                            System.out.println("***ERROR: Invalid input!***");
                            break;
                    }
                    if (randomWordToGuess1.equals(new String(displayChar))) {
                        continueGame = true;

                        System.out.println(level++);
                    }
                }

            }
        }
    }
}