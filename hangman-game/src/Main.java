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
        //show the current word
        output.showWord(currentWordObject.linedWord);
        System.out.println("Type a letter and press enter to make a guess!");
        //Game loop to let the user input again
        while (gameLogicObject.newLinedWord.contains("_")){

            //get user input
            input.getUserInput();
            //check input against the word
            gameLogicObject.checkInput(currentWordObject.chosenWord, input.userString, currentWordObject.linedWord);
            //show new lined word if a guess was right
        }
        output.gameWin();


        //if lives = 0 lose,if no lines =win

    }
}