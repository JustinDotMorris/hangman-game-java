public class WordManager {
    //-----------------Variables-----------------------
    public String chosenWord = "";
    public String linedWord = "";
    final String[] words = new String[]{"thee", "quickk", "brownn", "foxess", "jumpp", "overr", "lazyy", "dogss"};

    //---------------------Getters & Setters------------------


    //--------------------Methods---------------------------
    //method to get a random word from the array
    public void generateWord(){
        //get array length
        int wordArrayLength = words.length;
        //get random number from the length of the array
        int randomArrayNumber = (int)(Math.random() *wordArrayLength);
        //display the number that the index correlates to
        chosenWord = words[randomArrayNumber];
        System.out.println("chosenWord = "+chosenWord);
        //---------------------
        int chosenWordLength = chosenWord.length();
        linedWord = "_".repeat(chosenWordLength);
        System.out.println("linedWord = "+linedWord);
    }
}
