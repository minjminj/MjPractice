/*
 * Calendar 클래스를 이용하여 운영체제의 시간대를 기준으로 Calendar 얻기
 * 2018.05.08(김민정)
 */

package chap11;

import java.util.Calendar;

public class P540_CalendarExample {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();	// Calendar는 추상클래스이기 때문에 new 할수 없는 대신 getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
			
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
			
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
			
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
			
		default :
			strWeek = "일";
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println(strWeek + "요일");
		System.out.println(strAmPm + " ");
		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
	}
}



 




