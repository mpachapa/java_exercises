//linking package
package Scanner;

//imports
import java.util.Scanner;

public class HelloThere {
    //declaration of variables
    public Scanner scan = new Scanner(System.in);
    //variables
    private String userResp;
    private String greeting;
    private String response;
    private String ending;

    public HelloThere(){
        greeting = "Hi there! How are you doing today?";
        response = "Wow that's great! Tell me more!";
        ending = "It's been nice chatting! Goodbye!\n";
    }
    public void run(){
        System.out.println(this.getGreeting());
        userResp = scan.nextLine();
        System.out.println(this.getResponse());
        userResp = scan.nextLine();
        System.out.println(this.getEnding());
    }
    //Defining of setters and getters
    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getEnding() {
        return ending;
    }

    public void setEnding(String ending) {
        this.ending = ending;
    }
}
