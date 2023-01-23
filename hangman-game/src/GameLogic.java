import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class GameLogic {
    ArrayList ArrayIndexes = new ArrayList();
    ArrayList storedIndex = new ArrayList();
    private int lives = 8;

    public void checkInput(String chosenWord,String userString, String linedWord){
        //if the word contains a letter from the array
        if (chosenWord.contains(userString)){
            System.out.println("This letter is in the string");
            //split word string into characters array
            String[] splitChosenWord = chosenWord.split("");
            //make the array into an array list for flexibility
            ArrayList<String> chosenWordCharArr = new ArrayList<String>(Arrays.asList(splitChosenWord));
            System.out.println(chosenWordCharArr);
            //for loop to find each index of a letter
            //for each item check if=userinput, if yes = add index to array, if no = carry on

            for ( int i = 0; i < chosenWordCharArr.size() ; i++ ) {
                if (Objects.equals(chosenWordCharArr.get(i), userString)){
                    storedIndex.add(i);
                    System.out.println(storedIndex);
                }
            }
//            linedWord = linedWord.substring(0,storedIndex)
            String[] linedWordSplit = linedWord.split("");
            ArrayList <String> linedWordArraylist = new ArrayList(
            Arrays.asList(linedWordSplit));
            System.out.println(linedWordArraylist);

            //where i is equal to an arraylist index replace with userInput
//            for (int i =0; i < linedWordArraylist.size();i++){
//                if (i=arr){
//
//                }
//            }

//            for (userString.indexOf(userString)){
//
//            }
        //find the letters in the array's indexes and replace the lined word's letters with the words on those index


        }else {
            System.out.println("-----------------------------------------------------------------------");
            lives = lives -1;
            System.out.println("The letter "+ userString +" was not in the word");
            System.out.println("You lost a life! You have " + lives + " Remaining!");
        }
    }
    //ask about why byte doesn't work for score???????????
}
