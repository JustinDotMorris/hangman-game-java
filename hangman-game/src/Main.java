public class Main {
    public static void main(String[] args) {

        WordManager currentWordObject = new WordManager();
        Inputs input = new Inputs();
        Outputs output = new Outputs();
        GameLogic gameLogicObject = new GameLogic();

        //generate the word for this game
        currentWordObject.generateWord();
        //show start sequence
        output.startGame();
        //Game loop to let the user input again ------Not working as expected??? program ends?
//        while (currentWordObject.chosenWord.contains("_")){
//
//        }
        //show the current word
        output.showWord(currentWordObject.linedWord);
        //get user input
        input.getUserInput();
        //check input against the word
        gameLogicObject.checkInput(currentWordObject.chosenWord, input.userString, currentWordObject.linedWord);
        //show new lined word if a guess was right

        //if the linedWord contains lines then let the user input again, if lives 0 lose,if no lines =win

//        output.checkWord(currentWordObject.chosenWord, String.valueOf(input.guessesArrList));







    }
}