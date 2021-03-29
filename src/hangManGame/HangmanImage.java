package hangManGame;

public class HangmanImage {

     SportsWords sportsWords;
     MovieWords movieWords;

    public HangmanImage() {
    }

    public SportsWords getSportsWords() {
        return sportsWords;
    }

    public void setSportsWords(SportsWords sportsWords) {
        this.sportsWords = sportsWords;
    }

    public HangmanImage(SportsWords sportsWords) {
        this.sportsWords = sportsWords;
    }
    public MovieWords getMovieWords() {
        return movieWords;
    }

    public void setMovieWords(MovieWords movieWords) {
        this.movieWords = movieWords;
    }

    public HangmanImage(MovieWords movieWords) {
        this.movieWords = movieWords;
    }

    public static void man1(){
        System.out.println("Wrong guess, try again");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("______");
        System.out.println();
    }

    public static void man2(){
        System.out.println("Wrong guess, try again");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("___|___");
    }

    public static void man3(){
        System.out.println("Wrong guess, try again");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("___|___");
    }

    public static void man4(){
        System.out.println("Wrong guess, try again");
        System.out.println("   ____________");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   | ");
        System.out.println("___|___");
    }

    public static void man5(){
        System.out.println("Wrong guess, try again");
        System.out.println("   ____________");
        System.out.println("   |      _|_");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   | ");
        System.out.println("___|___");
    }

    public static void man6(){
        System.out.println("Wrong guess, try again");
        System.out.println("   ____________");
        System.out.println("   |          _|_");
        System.out.println("   |         /   \\");
        System.out.println("   |        |     |");
        System.out.println("   |         \\_ _/");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("___|___");
    }
    public static void man7(){
        System.out.println("Wrong guess, try again");
        System.out.println("   ____________");
        System.out.println("   |          _|_");
        System.out.println("   |         /   \\");
        System.out.println("   |        |     |");
        System.out.println("   |         \\_ _/");
        System.out.println("   |           |");
        System.out.println("   |           |");
        System.out.println("   |");
        System.out.println("___|___");
    }
    public static void man9(){
        System.out.println("Wrong guess, try again");
        System.out.println("   ____________");
        System.out.println("   |          _|_");
        System.out.println("   |         /   \\");
        System.out.println("   |        |     |");
        System.out.println("   |         \\_ _/");
        System.out.println("   |           |");
        System.out.println("   |           |");
        System.out.println("   |          / \\ ");
        System.out.println("___|___      /   \\");
    }
    public static void man8(){
        System.out.println("Wrong guess, try again!");
        System.out.println("   ____________");
        System.out.println("   |          _|_");
        System.out.println("   |         /   \\");
        System.out.println("   |        |     |");
        System.out.println("   |         \\_ _/");
        System.out.println("   |          _|_");
        System.out.println("   |         / | \\");
        System.out.println("   |          /     ");
        System.out.println("___|___      /       ");

    }
    public static void man10(){
        System.out.println("GAME OVER!");
        System.out.println("   ____________");
        System.out.println("   |          _|_");
        System.out.println("   |         /   \\");
        System.out.println("   |        |     |");
        System.out.println("   |         \\_ _/");
        System.out.println("   |          _|_");
        System.out.println("   |         / | \\");
        System.out.println("   |          / \\ ");
        System.out.println("___|___      /   \\");
    }
}

