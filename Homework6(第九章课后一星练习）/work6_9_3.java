import java.util.Date;
public class work6_9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l = 10000;//用于记录最新的流逝时间
		
		Date date = new Date(l);
		printDate(l, date);
		l *= 10;
		
		//通过循环设置新的流逝时间并显示日期
		for(int i = 0; i < 7; i++) {
			date.setTime(l);
			printDate(l, date);
			l *= 10;
		}
		
	}
	
	//用于显示日期
	public static void printDate(long l, Date date) {
		
		System.out.println(l + ": " + date.toString());

	}

}
