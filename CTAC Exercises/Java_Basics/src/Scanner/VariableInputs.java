package Scanner;

import java.util.Scanner;

public class VariableInputs {
    //Declaration of variables
    public String question;
    private Scanner scan = new Scanner(System.in);
    private String text;
    private int integer;
    private double doub;
    private boolean bool;

    public VariableInputs(){
        question = "Please enter a/an ";
        System.out.println(question + "String: ");
        text = scan.nextLine();
        System.out.println(question + "Integer:");
        integer = scan.nextInt();
        System.out.println(question + "Double:");
        doub = scan.nextDouble();
        System.out.println(question + "Boolean:");
        bool = scan.nextBoolean();
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Your inputs are: " +
                "String= " + text +
                ", integer= " + integer +
                ", double= " + doub +
                ", boolean= " + bool;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public double getDouble() {
        return doub;
    }

    public void setDouble(double doub) {
        this.doub = doub;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

}

