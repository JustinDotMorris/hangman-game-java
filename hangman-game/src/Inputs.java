import java.util.Scanner;

public class Inputs {
    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.next();
        System.out.println("You Typed:" + userString);
    }
}
