import java.util.Random;

public class Words {
    //Set up array of words
    final String[] words = new String[]{"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};

    //method to get a random word fromm the array
    public void getWord(){
        //get array length
        int wordArrayLength = words.length;
        System.out.println(wordArrayLength);
        //get random number from the length of the array
        int randomArrayNumber = (int)(Math.random() *wordArrayLength);
        System.out.println(randomArrayNumber);
        //display the number that the index correlates to
//        String chosenWord = words.get(words,randomArrayNumber);
        String chosenWord = words[randomArrayNumber];
        System.out.println(chosenWord);

    }

}
