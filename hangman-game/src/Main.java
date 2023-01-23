public class Main {
    public static void main(String[] args) {

        WordManager currentWordObject = new WordManager();
        Inputs input = new Inputs();
        Outputs output = new Outputs();
        GameLogic gameLogicObject = new GameLogic();

        currentWordObject.generateWord();
        output.startGame();
        output.showWord(currentWordObject.linedWord);
        System.out.println("Type a letter and press enter to make a guess!");

        while (gameLogicObject.newLinedWord.contains("_")){
            input.getUserInput();
            gameLogicObject.checkInput(currentWordObject.chosenWord, input.userString, currentWordObject.linedWord);
        }
        output.gameWin();
    }
}