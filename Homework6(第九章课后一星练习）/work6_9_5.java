import java.util.GregorianCalendar;
public class work6_9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		//��Ϊ get(GregorianCalendar.MONTH) ���ص�ֵ�Ǵ� 0 ��ʼ�ģ��� 0 ���� 1 �£��������ֶ����� 1
		System.out.println("now: " + gregorianCalendar.get(GregorianCalendar.YEAR) + "."
				+ (gregorianCalendar.get(GregorianCalendar.MONTH) + 1) + "."
				+ gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
		
		gregorianCalendar.setTimeInMillis(1234567898765L);
		System.out.println("after set: " + gregorianCalendar.get(GregorianCalendar.YEAR) + "."
				+ (gregorianCalendar.get(GregorianCalendar.MONTH) + 1) + "."
				+ gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));


	}

}
