import java.util.ArrayList;
import java.util.Scanner;

public class Inputs {
    public String userString =("");
    public ArrayList guessesArrList = new ArrayList();
    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);
        userString = scanner.next();
        guessesArrList.add(userString);
        System.out.println(guessesArrList);
        System.out.println("You Typed:" + userString);
    }
}
