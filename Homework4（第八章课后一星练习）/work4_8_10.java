//����дһ��������һ�� 4 x 4 �ľ������������ 0 �� 1, ��ӡ�þ����ҵ���һ��������� 1 ���к��С�
public class work4_8_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ary = new int[4][4];
		  for (int i = 0; i < ary.length; i++) {
		   for (int j = 0; j < ary[i].length; j++) {
		    ary[i][j] = (int) (Math.random() * 2);//������0����1
		    System.out.print(ary[i][j] + "\t");
		   }
		   System.out.println();
		  }
		  int maxR = 0;//�����г���1�Ĵ��������ֵ��
		  int maxC = 0;//�����г���1�Ĵ��������ֵ��
		  int row = 0;//��
		  int col = 0;//��
		  for (int i = 0; i < ary.length; i++) {
		   int numR = 0;//ÿ��ѭ��һ�е�1�Ĵ���ͳ��
		   int numC = 0;//ÿ��ѭ��һ�е�1�Ĵ���ͳ��
		   for (int j = 0; j < ary[i].length; j++) {
		    if (ary[i][j] == 1) {
		     numR++;//������1
		    }
		    if (ary[j][i] == 1) {
		     numC++;
		    }
		   }
		   if (numR > maxR) {//�еĺ��еĽ��бȽ�
		    maxR = numR;
		    row = i;
		   }
		   if (numC > maxC) {
		    maxC = numC;
		    col = i;
		   }
		  }
		  System.out.println("��������1��ʼ�� �������1���У�" + (row + 1));
		  System.out.println("��������1��ʼ�� �������1���У�" + (col + 1));

	}

}
