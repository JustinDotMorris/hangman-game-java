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
        }

        public void gameWin(){
                System.out.println("__   _____  _   _  __        _____ _   _ _ \n" +
                        "\\ \\ / / _ \\| | | | \\ \\      / |_ _| | / | |\n" +
                        " \\ V | | | | | | |  \\ \\ /\\ / / | || |/  | |\n" +
                        "  | || |_| | |_| |   \\ V  V /  | ||  /| |_|\n" +
                        "  |_| \\___/ \\___/     \\_/\\_/  |___|_/ |_(_)");
        }

        public void gameLoss(){
                System.out.println(" __        ______        _______.___________.        ___          __       __   _______  _______ \n" +
                        "|  |      /  __  \\      /       |           |       /   \\        |  |     |  | |   ____||   ____|\n" +
                        "|  |     |  |  |  |    |   (----`---|  |----`      /  ^  \\       |  |     |  | |  |__   |  |__   \n" +
                        "|  |     |  |  |  |     \\   \\       |  |          /  /_\\  \\      |  |     |  | |   __|  |   __|  \n" +
                        "|  `----.|  `--'  | .----)   |      |  |         /  _____  \\     |  `----.|  | |  |     |  |____ \n" +
                        "|_______| \\______/  |_______/       |__|        /__/     \\__\\    |_______||__| |__|     |_______|");
        }

//        public void checkWord(String currentWord,String guessedLetters){
//                System.out.println("current word is="+currentWord);
//                System.out.println("guessed letters are="+guessedLetters);
////                if (currentWord.contains(guessedLetters)){
////                System.out.println("The word was");}
//        }





}
