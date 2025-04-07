import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor{
    public static void main(String []args) {
       // Rock , Paper and Scissor Game
        Random ra = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 0 for Rock");
        System.out.println("Enter 1 for Paper");
        System.out.println("Enter 2 for Scissor");
        System.out.println("--------------------------------------");

        System.out.print("How many times to play: ");
        int n = sc.nextInt();

        int my_count = 0;
        int comp_count = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            int My_side = sc.nextInt();
            int comp_side = ra.nextInt(0, 3);
            System.out.println("Computer enter: " + comp_side);
            System.out.println("I enter: " + My_side);

            if ((My_side == 0 && comp_side == 2) || (My_side == 1 && comp_side == 0)
                    || (My_side == 2 && comp_side == 1)) {
                System.out.println("You Win !!");
                my_count++;
            } else if ((My_side == 2 && comp_side == 0) || (My_side == 0 && comp_side == 1)
                    || (My_side == 1 && comp_side == 2)) {
                System.out.println("You lose !!");
                comp_count++;
            } else {
                System.out.println("Game tie");
            }
        }

        if(my_count>comp_count){
            System.out.println("You are the Final Winner !!");
        }
        else{
            System.out.println("You lose Completely !!");
        }
    }
}