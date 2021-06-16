import java.util.GregorianCalendar;
public class work6_9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		//因为 get(GregorianCalendar.MONTH) 返回的值是从 0 开始的，即 0 代表 1 月，所以我手动加了 1
		System.out.println("now: " + gregorianCalendar.get(GregorianCalendar.YEAR) + "."
				+ (gregorianCalendar.get(GregorianCalendar.MONTH) + 1) + "."
				+ gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
		
		gregorianCalendar.setTimeInMillis(1234567898765L);
		System.out.println("after set: " + gregorianCalendar.get(GregorianCalendar.YEAR) + "."
				+ (gregorianCalendar.get(GregorianCalendar.MONTH) + 1) + "."
				+ gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));


	}

}
