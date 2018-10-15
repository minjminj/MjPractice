/*
 * ī�信 �� �÷ȴ��� �����غ���.
 * �� �迭�� �ʵ�� ����. �ʱⰪ�� �����ڿ� ����. compute()���� ������ ��� ���. prn()���� ��� ���(��� ������ ���� ����)
 * 2018.04.23
 */
package Prac;


public class Practice5 {

	String[] no; // �й�
	String[] name; // �̸�
	int[] kor; // ����
	int[] eng; // ����
	int[] tot; // ����
	double[] avg; //���
				


	public Practice5() {
		no = new String[] {"n1", "n2", "n3", "n4", "n5"};
		name = new String[] {"kim", "lee", "cho", "jin", "han"};
		kor = new int[] {88, 99, 45, 75, 79};
		eng = new int[] {63, 97, 59, 68, 77};
		tot = new int[5];
		avg = new double[5];
	}
	
	public void compute() {
		for (int i=0 ; i<no.length ; i++) {
			tot[i] = (kor[i]+eng[i]);
			avg[i] = (tot[i] / 2.0);
		}
	}
	
	public void prn() {
		System.out.println("======  ����ó��  ======");
		System.out.println("�й�  ����  ����  ����  ����  ���");
		System.out.println("-----------------------");
		for (int i=0 ; i<no.length ; i++) {
			System.out.println(no[i]+"  "+name[i]+"  "+kor[i]+"  "+eng[i]+"  "+tot[i]+"  "+avg[i]);
			
		}
	}
	
	public static void main(String[] args) {
		Practice5 p5 = new Practice5();
		p5.compute();
		p5.prn();
	}
}
