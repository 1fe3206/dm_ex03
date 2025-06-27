import java.util.Random;
import java.util.Scanner;

public class DiceGame{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name?\n>");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        Random rand = new Random();
        int x = rand.nextInt(6) + 1;
        int y = rand.nextInt(6) + 1;

        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + x);
        System.out.println("Die 2: " + y);
        System.out.println("Total value: " + (x+y));
    }
}
