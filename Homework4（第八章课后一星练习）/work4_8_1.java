//编写一个方法，求整数矩阵中特定列的所有元素的和，使用下面的方法头：
//public static double sumColumn (double[][] m , int columnlndex)
//编写一个测试程序，读取一个 3 x 4 的矩阵，然后显示每列元素的和。
import java.util.*;
public class work4_8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		double s;
		double [][]a;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the row and the column of the array:");
		m=input.nextInt();
		n=input.nextInt();
		System.out.println("Enetr a"+m+"-by-"+n+"matrix row by row:");
		a=new double[m][n];
		for(int row=0;row<a.length;row++) {
			for(int column=0;column<a[row].length;column++) {
				a[row][column]=input.nextDouble();
				}
			
		}
		for(int i=0;i<n;i++) {
			s=sumColumn(a,i);
			System.out.println("Sum of the elements at column "+i+" is " +s );
			}
	}
	public static double sumColumn (double[][] m,int columnlndex) {
		double sum=0;
		for(int i=0;i<m.length;i++) {
			sum=sum+m[i][columnlndex];
		}
		return sum;
		}
	}
	
	


