import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class GameLogic {
    String[] linedWordSplit = {};
    ArrayList<Integer> storedIndex = new ArrayList<>();
    String newLinedWord = "_";
    private int lives = 8;

    public void checkInput(String chosenWord,String userString, String linedWord){
        if (chosenWord.contains(userString)){
            System.out.println("The letter "+userString+" is in the Word");
            String[] splitChosenWord = chosenWord.split("");
            ArrayList<String> chosenWordCharArr = new ArrayList<String>(Arrays.asList(splitChosenWord));

            for ( int i = 0; i < chosenWordCharArr.size() ; i++ ) {
                if (Objects.equals(chosenWordCharArr.get(i), userString)){
                    storedIndex.add(i);
                }
            }

            String[] linedWordSplit = linedWord.split("");
            ArrayList <String> linedWordArraylist = new ArrayList<>(Arrays.asList(linedWordSplit));

            for (int i =0; i < storedIndex.size();i++){
                int index = storedIndex.get(i);
                String chosenChar = chosenWordCharArr.get(index);
                linedWordSplit[index]=chosenChar;
            }
            newLinedWord = String.join("", linedWordSplit);
            System.out.println("The Word is: "+newLinedWord);

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
