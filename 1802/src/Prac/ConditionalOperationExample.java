/*
 * chap3. ������. ���� ������. ����
 * �ۼ�����: 2018.04.18
 */

package Prac;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		
		double tem; //���
		
		tem= -6.3;
		
		String ss = (tem >= 20)? "����" : (tem >= 10)? "��" : ((tem >= 0)? "����" : "�ܿ�");
			
		System.out.println(ss);
	}
}
