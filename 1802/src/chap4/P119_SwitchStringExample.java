/*
 * StringŸ���� switch��
 * ���� position�� �ν��Ͻ��� ������ ����, �����ڷκ��� ���ڿ��� �޾� position�� ����, chk() �޼ҵ带 ����Ͽ� ��� ó��
 */

package chap4;

public class P119_SwitchStringExample {

	String position;
	
	
	 public P119_SwitchStringExample(String position) {
		
		this.position = position;
	 }		 
	
	
	public void chk() {
		switch (position) {
		
		case "����" :
			System.out.println("700����");
			break;
		case "����" :
			System.out.println("500����");
			break;
		default :
			System.out.println("300����");
		}
	}
}
