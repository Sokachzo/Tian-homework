//编写下面的方法，返回二维数组中最大元素的位置。public static int[] locateLargest(double[][] a)
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Arrays;
import java.util.Scanner;

public class work4_8_13 {
	public static int[] locateLargest(double[][] a){
        //返回值是包含两个元素的一维数组
        int[] locateLargest = new int[2];
        double number = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                if (number <a[i][j]) {
                    number=a[i][j];
                    //这两个元素表示二维数组中最大元素的行下标和列下标
                    locateLargest[0] = i;
                    locateLargest[1] = j;
                }
            }
        }
     return locateLargest;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the number of rows and columns of the array:");
	        Scanner scanner = new Scanner(System.in);
	        int ranks = scanner.nextInt();
	        int column = scanner.nextInt();
	        System.out.println("Enter the array");
	        double [][] array = new double[ranks][column];
	        for (int i = 0; i <array.length; i++) {
	            for (int j = 0; j <array[0].length ; j++) {
	               array[i][j] = scanner.nextDouble();
	            }
	        }
	        System.out.println(Arrays.toString(locateLargest(array)));

	
	}

}
