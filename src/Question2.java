import java.awt.*;
import java.util.Scanner;
import java.util.Random;
public class Question2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int secNum = rnd.nextInt(11);

        System.out.println("Welcome to my guessing game where the objective is to guess the secret number. " +
                "In this game you have 5 lives, so have fun and good luck");
        for(int i = 0; i<=5; i++){
            System.out.println("please enter a number");
            int userInput = sc.nextInt();

            if(userInput == secNum){
                System.out.println("You won, the secret number was " + secNum);
            }else if (userInput < secNum) {
                System.out.println("Your guess is too low. Try again");
            }else if(userInput > 10){
                System.out.println("The secret number is between 0 and 10");
            }else {
                System.out.println("your guess is too high. Try again");
            }//end of if else statement
        }//end of for loop
        System.out.println("You ran out of lives. The secret number was "+ secNum);
    }//end of main
}//end of class
