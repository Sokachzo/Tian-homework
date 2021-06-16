import java.util.Scanner;
public class work3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loterry = ((int)Math.random()*900 + 100);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your loterry pick (three digits): ");
        int guess = input.nextInt();

        int loterryDigit1 = loterry / 10;
        int loterryDigit2 = loterry % 10;
        int loterryDigit3 = loterry / 10 /10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
        int guessDigit3 = guess / 10 / 10;

        System.out.println("The loterry number is " + loterry);

        if(guess == loterry)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == loterryDigit1
                && guessDigit1 == loterryDigit2
                && guessDigit3 == loterryDigit3)
            System.out.println("Match all digits: you win $3,000");
        else if(guessDigit1 == loterryDigit1
                || guessDigit1 == loterryDigit2
                || guessDigit1 == loterryDigit3
                || guessDigit2 == loterryDigit1
                || guessDigit2 == loterryDigit2
                || guessDigit2 == loterryDigit3
                || guessDigit3 == loterryDigit1
                || guessDigit3 == loterryDigit2
                || guessDigit3 == loterryDigit3)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, not match");



	}

}
