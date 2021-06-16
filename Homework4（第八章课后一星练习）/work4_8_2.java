//）编写一个方法，求n*n的 double 类型矩阵中主对角线上所有数宇的和，使用下面的方法头：
//public static double sumMajorDiagonal (double[][] m)
//编写一个测试程序，读取一个 4 x 4 的矩阵，然后显示它的主对角线上的所有元素的和。
import java.util.Scanner;
public class work4_8_2 {
public static double sumMajorDiagonal (double [][] m){
    double sum = 0;
    for (int i =0;i < m.length;i++){
        sum = sum + m[i][i];
    }
    return sum;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row of the a(row=column): ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] matrix = new double[row][column];
        System.out.println("Enetr a "+row+"-by-"+column+"matrix row by row: ");
        for (int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix[i].length;j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("Sum of elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }
    
}
