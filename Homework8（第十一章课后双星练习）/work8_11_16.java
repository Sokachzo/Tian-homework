import java.util.ArrayList; 
import java.util.Random; 
import java.util.Scanner;
public class work8_11_16 {
	public static void main(String[] args) {
	    Random rand = new Random();
	    int number1 = rand.nextInt(10);
	    int number2 = rand.nextInt(10);
	    
	    Scanner input = new Scanner(System.in);
	   
	    System.out.println("what is " + number1 +"+" + number2 +"?");
	    int answer=input.nextInt();
	    ArrayList answers=new ArrayList();
	    
	    while(number1 + number2!=answer) {
	    	if (answers.contains(answer)){
	    		System.out.println("You already entered" + answer);
	    		}
	    	answers.add(answer);
	    	System.out.println("wrong answer.try again. what is " + number1 + "+" + number2 +"?");
	    	answer=input.nextInt();
	    }
	
	    System.out.println("you got it !");
	}
	
		
	}
