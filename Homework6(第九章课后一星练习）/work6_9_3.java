import java.util.Date;
public class work6_9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l = 10000;//���ڼ�¼���µ�����ʱ��
		
		Date date = new Date(l);
		printDate(l, date);
		l *= 10;
		
		//ͨ��ѭ�������µ�����ʱ�䲢��ʾ����
		for(int i = 0; i < 7; i++) {
			date.setTime(l);
			printDate(l, date);
			l *= 10;
		}
		
	}
	
	//������ʾ����
	public static void printDate(long l, Date date) {
		
		System.out.println(l + ": " + date.toString());

	}

}
