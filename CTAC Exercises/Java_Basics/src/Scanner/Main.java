package Scanner;
//important imports
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HelloThere hello = new HelloThere();
        Superhero supers = new Superhero();
        System.out.println("Hello world! What's your name?");
        //takes input
        String text = scanner.nextLine();
        System.out.println("Hello there, " + text);
        hello.run();
        supers.run();
        VariableInputs vars = new VariableInputs();
    }
}