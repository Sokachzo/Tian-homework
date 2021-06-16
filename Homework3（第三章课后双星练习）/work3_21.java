import java.util.Scanner;
public class work3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int y = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int m = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int q = input.nextInt();
        if(m == 1)
        {
            m = 13;
            y -= 1;
        }
        else if(m == 2)
        {
            m = 14;
            y -= 1;
        }
        int j = y / 100;
        int k = y % 100;
        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        System.out.print("Day of the week is ");
        if(h == 0)
            System.out.println("Saturday");
        else if(h == 1)
            System.out.println("Sunday");
        else if(h == 2)
            System.out.println("Monday");
        else if(h == 3)
            System.out.println("Tuesday");
        else if(h == 4)
            System.out.println("Wednesday");
        else if(h == 5)
            System.out.println("Thursday");
        else if(h == 6)
            System.out.println("Friday");

	}

}
