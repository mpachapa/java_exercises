//package declaration
package Scanner;
//imports
import java.util.Scanner;

public class Superhero {
    //declaration of variables
    public Scanner scan = new Scanner(System.in);
    //Input Questions
    public String intro, whoIs, wPower;
    //Their name and power
    private String power, name;
    public Superhero() {
        intro = "Let's write a story about a superhero.";
        whoIs = "Who is the hero of our story?";
        wPower = "What is their power?";
    }

    public void run(){
        System.out.println(this.getIntro());
        System.out.println(this.getWhoIs());
        this.name = scan.nextLine();
        System.out.println(this.getWhatPower());
        this.power = scan.nextLine();
        System.out.println("Here is their story:\n");
        this.story();
    }
    //story method to print out
    public void story(){
        System.out.println("There once was a superhero named " + this.getName() + ", who had the power of " + this.getPower() + ".");
        System.out.println("As they grew older, " + this.getName() + " saw that the world needed them.");
        System.out.println(this.getName() + " used their ability to " + this.getPower() + " to save the world.\n\n");
    }

    public String getName() {
        return name;
    }

    public String getIntro() {
        return intro;
    }

    public String getPower() {
        return power;
    }

    public String getWhoIs() {
        return whoIs;
    }

    public String getWhatPower() {
        return wPower;
    }
}
