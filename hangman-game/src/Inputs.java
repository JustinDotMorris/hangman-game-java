import java.util.ArrayList;
import java.util.Scanner;

public class Inputs {
    public String userString =("");
    public ArrayList guessesArrList = new ArrayList();
    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);
        userString = scanner.next();
        userString = userString.toLowerCase();
        if(userString.matches("[a-zA-Z]+")){
            if (guessesArrList.contains(userString)){
                System.out.println("You've already entered that letter...Try again!");
            }
        }else{
            System.out.println("That wasn't a letter? try again... ");
        }


        guessesArrList.add(userString);
        System.out.println("You've tried these letters: "+guessesArrList);
        System.out.println("-------------------------------------------------------------------------------");
    }
}
