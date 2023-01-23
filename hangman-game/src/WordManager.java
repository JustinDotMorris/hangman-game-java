public class WordManager {
    //-----------------Variables-----------------------
    public String chosenWord = "";
    public String linedWord = "";
    final String[] words = new String[]{"luxury", "speeches", "turqouise", "peppers", "lorries", "squirrel", "microphone", "coffee","llamas","happiness"};

    public void generateWord(){
        int wordArrayLength = words.length;
        int randomArrayNumber = (int)(Math.random() *wordArrayLength);
        chosenWord = words[randomArrayNumber];
        int chosenWordLength = chosenWord.length();
        linedWord = "_".repeat(chosenWordLength);
    }
}
