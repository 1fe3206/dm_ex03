import java.util.Random;

public class DiceGame{
    public static void main(String args[]){
        Random rand = new Random();
        int x = rand.nextInt(6) + 1;
        int y = rand.nextInt(6) + 1;

        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + x);
        System.out.println("Die 2: " + y);
        System.out.println("Total value: " + (x+y));
        if((x+y)>7){
            System.out.println("You won!");
        } else{
            System.out.println("You lost!");
        }
    }
}
