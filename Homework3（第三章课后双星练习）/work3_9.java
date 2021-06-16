import java.util.Scanner;
public class work3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer:");
        String s = input.nextLine();
        int i;
        int ans=0;
        for(i=0;i<9;++i)
        {
            char t = s.charAt(i);
            ans += ((int)t-48)*(i+1);
        }
        ans %= 11;
        if (ans == 10) {
            System.out.println("THe ISBN-10 number is " + s + 'X');
        } else {
            System.out.println("THe ISBN-10 number is " + s + ans);
        }
        System.exit(0);

	}

}
