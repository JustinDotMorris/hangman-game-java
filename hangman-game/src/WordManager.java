public class WordManager {
    //-----------------Variables-----------------------
    public String chosenWord = "";
    public String linedWord = "";
    final String[] words = new String[]{"the", "quick", "brown", "foxes", "jump", "over", "lazy", "dogs"};

    //---------------------Getters & Setters------------------


    //--------------------Methods---------------------------
    //method to get a random word from the array
    public void generateWord(){
        //get array length
        int wordArrayLength = words.length;
        //get random number from the length of the array
        int randomArrayNumber = (int)(Math.random() *wordArrayLength);
        //display the number that the index correlates to
        String chosenWord = words[randomArrayNumber];
        System.out.println(chosenWord);
        //---------------------
        int chosenWordLength = chosenWord.length();
        String linedWord = "_".repeat(chosenWordLength);
        System.out.println(linedWord);
    }
}
