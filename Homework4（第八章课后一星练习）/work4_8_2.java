//����дһ����������n*n�� double ���;��������Խ�������������ĺͣ�ʹ������ķ���ͷ��
//public static double sumMajorDiagonal (double[][] m)
//��дһ�����Գ��򣬶�ȡһ�� 4 x 4 �ľ���Ȼ����ʾ�������Խ����ϵ�����Ԫ�صĺ͡�
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
