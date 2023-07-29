import java.util.Scanner;
import java.util.*;
public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0 is for rock");
        System.out.println("1 is for paper");
        System.out.println("2 is for scissor");
        int computer_choice;
        int computer_won=0;
        int My_choice;
        int me=0;
        int game = 1;
        while (game <= 5) {
            Random ra = new Random();
            computer_choice = ra.nextInt(2);
            My_choice = sc.nextInt();
            switch (My_choice) {
                case 0:
                    System.out.println("You choose Rock");
                    break;
                case 1:
                    System.out.println("You choose Paper");
                    break;
                case 2:
                    System.out.println("You choose Scissor");
            }
            switch (computer_choice) {
                case 0:
                    System.out.println("Computer choose Rock");
                    break;
                case 1:
                    System.out.println("Computer choose Paper");
                    break;
                case 2:
                    System.out.println("Computer choose Scissor");
            }
            if (computer_choice == My_choice) {
                System.out.println("Match Tie");
            } else if (computer_choice == 0 && My_choice == 1) {
                System.out.println("You Won, Computer loss");
                me++;
            } else if (computer_choice == 0 && My_choice == 2) {
                System.out.println("Computer Won , You loss");
                computer_won++;
            } else if (computer_choice == 1 && My_choice == 0) {
                System.out.println("Computer Won , You loss");
                computer_won++;
            } else if (computer_choice == 1 && My_choice == 2) {
                System.out.println("You Won , Computer loss");
                me++;
            } else if (computer_choice == 2 && My_choice == 0) {
                System.out.println("You Won , Computer loss");
                me++;
            } else if (computer_choice == 2 && My_choice == 1) {
                System.out.println("Computer Won , You loss");
                computer_won++;
            }
            if (game == 5) {
                break;
            }
            game++;
        }
        System.out.println("------------------");
        System.out.println("Computer" +" :"+computer_won );
        System.out.println("You" +" :"+me);
        System.out.println("------------------");

        if(computer_won>me)
        {
            System.out.println("Computer Won the game >>");
        }
        else if (computer_won == me )
        {
            System.out.println("Match tie");
        }
        else
        {
            System.out.println("You Won the game !!!");
        }
    }
}
