import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
     public static final Random Rn = new Random();
     public static final int MAX_NUM = 80;
     public static void main(String[] args) {
    	 int numberToFind = Rn.nextInt(MAX_NUM) + 1;
    	 Scanner s = new Scanner(System.in);
    	 int numberTries=0, numberGuessed=0;
    	 
    	 while(numberGuessed != numberToFind) {
    		 System.out.println("guess the number?");
    		 System.out.println("Enter your guess Number:");
    		 numberGuessed = s.nextInt();
    		 numberTries++;
    		 
    		 if (numberGuessed < 1 || numberGuessed >MAX_NUM) {
    			 System.out.println("Enter your guess between 1 and " + MAX_NUM);
    		 } else if (numberGuessed > numberToFind) {
    			 System.out.println("guessed number is too high !");
    		 } else if (numberGuessed < numberToFind) {
    			 System.out.println("guessed number is too low !");
    		 }
    	 }
    	 s.close();
    	 System.out.println("Congragulations you got the number " + numberToFind + " in " + numberTries + " tries ");
    }
}