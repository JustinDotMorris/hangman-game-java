public class Outputs {



        public void startGame(){
                System.out.println("------------------Welcome to------------------");
                System.out.println(" _                                             \n" +
                        "| |                                            \n" +
                        "| |__   __ _ _ __   __ _ _ __ ___   __ _ _ __  \n" +
                        "| '_ \\ / _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\ \n" +
                        "| | | | (_| | | | | (_| | | | | | | (_| | | | |\n" +
                        "|_| |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|\n" +
                        "                    __/ |                      \n" +
                        "                   |___/                       ");
        }

        public void showWord(String wordToShow){
                System.out.println("Your Word is: "+ wordToShow);
                System.out.println("Type a letter and press enter to make a guess!");
        }

        public void checkWord(String currentWord,String guessedLetters){
                System.out.println("current word is="+currentWord);
                System.out.println("guessed letters are="+guessedLetters);
//                if (currentWord.contains(guessedLetters)){
//                System.out.println("The word was");}
        }





}
