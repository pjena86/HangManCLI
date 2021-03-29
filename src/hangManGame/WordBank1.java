package hangManGame;

import java.util.Random;

public abstract class WordBank1 {

    public abstract String[] initializeWordBank();

    public void generateRandomWords(){
        SportsWords sw = new SportsWords();
       String[] swords = sw.initializeWordBank();
        Random rn = new Random();
        int index = rn.nextInt(swords.length);
    }
}
