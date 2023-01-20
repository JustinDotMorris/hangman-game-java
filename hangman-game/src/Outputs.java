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
//                System.out.println("Your Word is: "+ wordManager.linedWord);
//                System.out.println("Type a letter and press enter to make a guess!");

        }

        public void showWord(String wordToShow){
                System.out.println("Your Word is: "+ wordToShow);
                System.out.println("Type a letter and press enter to make a guess!");
        }





}
