import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class GameLogic {
    String[] linedWordSplit = {};
    ArrayList<Integer> storedIndex = new ArrayList<>();
    String newLinedWord = "_";
    private int lives = 8;

    public void checkInput(String chosenWord,String userString, String linedWord){

        //if the word contains a letter from the array
        if (chosenWord.contains(userString)){
            System.out.println("The letter "+userString+" is in the Word");
            //split word string into characters array
            String[] splitChosenWord = chosenWord.split("");
            //make the array into an array list for flexibility
            ArrayList<String> chosenWordCharArr = new ArrayList<String>(Arrays.asList(splitChosenWord));
            //for loop to find each index of a letter
            //for each item check if=userinput, if yes = add index to array, if no = carry on

            for ( int i = 0; i < chosenWordCharArr.size() ; i++ ) {
                if (Objects.equals(chosenWordCharArr.get(i), userString)){
                    storedIndex.add(i);
                }
            }

            //splits the lined word into an arraylist
            String[] linedWordSplit = linedWord.split("");
            ArrayList <String> linedWordArraylist = new ArrayList<>(Arrays.asList(linedWordSplit));

            //where i is equal to an arraylist index replace with userInput
            for (int i =0; i < storedIndex.size();i++){
                int index = storedIndex.get(i);
                String chosenChar = chosenWordCharArr.get(index);
                linedWordSplit[index]=chosenChar;
            }
            newLinedWord = String.join("", linedWordSplit);
            System.out.println("The Word is: "+newLinedWord);

        //find the letters in the array's indexes and replace the lined word's letters with the words on those index

        }else {
            if (lives >= 2){
                lives = lives -1;

                System.out.println("  _               _             _      _  __     _ \n" +
                        " | |             | |           | |    (_)/ _|   | |\n" +
                        " | |     ___  ___| |_    __ _  | |     _| |_ ___| |\n" +
                        " | |    / _ \\/ __| __|  / _` | | |    | |  _/ _ \\ |\n" +
                        " | |___| (_) \\__ \\ |_  | (_| | | |____| | ||  __/_|\n" +
                        " |______\\___/|___/\\__|  \\__,_| |______|_|_| \\___(_)\n" +
                        "                                                   ");
                System.out.println("The letter "+ userString +" was not in the word");
                System.out.println("Lives: " + lives);
            }
            else {
            System.out.println("   _____                         ____                 _ \n" +
                    "  / ____|                       / __ \\               | |\n" +
                    " | |  __  __ _ _ __ ___   ___  | |  | |_   _____ _ __| |\n" +
                    " | | |_ |/ _` | '_ ` _ \\ / _ \\ | |  | \\ \\ / / _ \\ '__| |\n" +
                    " | |__| | (_| | | | | | |  __/ | |__| |\\ V /  __/ |  |_|\n" +
                    "  \\_____|\\__,_|_| |_| |_|\\___|  \\____/  \\_/ \\___|_|  (_)");


            }



        }
    }
}
