//）编写一个程序，在一个 4 x 4 的矩阵中随机填入 0 和 1, 打印该矩阵，找到第一个具有最多 1 的行和列。
public class work4_8_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ary = new int[4][4];
		  for (int i = 0; i < ary.length; i++) {
		   for (int j = 0; j < ary[i].length; j++) {
		    ary[i][j] = (int) (Math.random() * 2);//随机填充0或者1
		    System.out.print(ary[i][j] + "\t");
		   }
		   System.out.println();
		  }
		  int maxR = 0;//保存行出现1的次数的最大值，
		  int maxC = 0;//保存列出现1的次数的最大值，
		  int row = 0;//行
		  int col = 0;//列
		  for (int i = 0; i < ary.length; i++) {
		   int numR = 0;//每次循环一行的1的次数统计
		   int numC = 0;//每次循环一列的1的次数统计
		   for (int j = 0; j < ary[i].length; j++) {
		    if (ary[i][j] == 1) {
		     numR++;//次数加1
		    }
		    if (ary[j][i] == 1) {
		     numC++;
		    }
		   }
		   if (numR > maxR) {//行的和行的进行比较
		    maxR = numR;
		    row = i;
		   }
		   if (numC > maxC) {
		    maxC = numC;
		    col = i;
		   }
		  }
		  System.out.println("【行数从1开始】 最多数字1的行：" + (row + 1));
		  System.out.println("【列数从1开始】 最多数字1的列：" + (col + 1));

	}

}
