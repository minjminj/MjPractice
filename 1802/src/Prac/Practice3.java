/*
 * ��� �� ������ ���� �����ڸ� Ȱ���Ͽ� �����ϱ�.
 * �ۼ�����: 2018.04.18
 */

package Prac;

public class Practice3 {
	public Practice3(double tem) {
		
		String ss = (tem >= 20)? "����" : (tem >= 10)? "��" : ((tem >= 0)? "����" : "�ܿ�");
		
		System.out.println(tem + "���� " + ss + "�Դϴ�"); 
	}
}
