/*
 * Calendar Ŭ������ �̿��Ͽ� �ü���� �ð��븦 �������� Calendar ���
 * 2018.05.08(�����)
 */

package chap11;

import java.util.Calendar;

public class P540_CalendarExample {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();	// Calendar�� �߻�Ŭ�����̱� ������ new �Ҽ� ���� ��� getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		
		case Calendar.MONDAY:
			strWeek = "��";
			break;
		
		case Calendar.TUESDAY:
			strWeek = "ȭ";
			break;
		
		case Calendar.WEDNESDAY:
			strWeek = "��";
			break;
			
		case Calendar.THURSDAY:
			strWeek = "��";
			break;
			
		case Calendar.FRIDAY:
			strWeek = "��";
			break;
			
		case Calendar.SATURDAY:
			strWeek = "��";
			break;
			
		default :
			strWeek = "��";
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year + "��");
		System.out.println(month + "��");
		System.out.println(day + "��");
		System.out.println(strWeek + "����");
		System.out.println(strAmPm + " ");
		System.out.println(hour + "��");
		System.out.println(minute + "��");
		System.out.println(second + "��");
	}
}



 




