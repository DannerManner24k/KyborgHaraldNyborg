package KyborgProgram;

import java.util.Scanner;

public class Parser {
    private Scanner reader;
    private int functionKyborg;

    public Parser () {
        reader = new Scanner(System.in);
    }
    public int getReader () {
       try {
            System.out.print("> ");
            functionKyborg = Integer.parseInt(reader.nextLine());

            System.out.println("Your input: " + functionKyborg);
        } catch (NumberFormatException ex) {
            System.out.println("Please enter a number!");
        }
        return functionKyborg;
    }
}
