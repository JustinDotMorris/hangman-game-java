public class Main {
    public static void main(String[] args) {

        WordManager currentWordObject = new WordManager();
        currentWordObject.generateWord();

        Outputs output = new Outputs();
            output.startGame();
            output.showWord(currentWordObject.linedWord);

        Inputs input = new Inputs();
            input.getUserInput();

    }


}