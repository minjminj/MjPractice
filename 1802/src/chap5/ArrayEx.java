/*
 * ǥ�� �ԷµǾ� �ִ� ������ �����Ͽ� 1���� �迭 6���� ����� �Ʒ��� ���ǿ� ���� ���α׷��� �ϼ��Ͻÿ�.
 * �� �迭�� �ʵ�� ����. �ʱⰪ�� �����ڿ� ����. compute()���� ������ ��� ���. prn()���� ��� ���(��� ������ ���� ����)
 */
package chap5;

public class ArrayEx {
	
	String[] no; // �й�
	String[] name;	// ����
	int[] kor;	// ����
	int[] eng; // ����
	int[] tot;	// ����
	double[] avg;	// ���
	
	public ArrayEx() {
		no = new String[]{"n1", "n2", "n3", "n4", "n5"};	
		name = new String[] {"kim", "lee", "hong", "park", "choi"};	
		kor = new int[]{99, 88, 77, 66, 55};	
		eng = new int[]{77, 88, 99, 77, 66};
		tot = new int[no.length];	// ������ �ʱⰪ �����ؾ������� ���� ���� ������� �𸣱� ������ ũ�⸦ �����������ν� �ʱ�ȭ + �迭�� ũ��= �й��迭�� �� ����
		avg = new double[no.length];	// 
	}
		// ���� ������ �������� compute()�� ���������� -> ������: ArrayEx().prn();
		// ���� ������ �������� compute() �� prn()�� ���������� -> ������: ArrayEx();
	
	public void compute() {
		
		for (int i=0 ; i<kor.length ; i++) {
			tot[i] = (kor[i]+eng[i]) ;
			avg[i] = (tot[i] / 2.0) ;
		}
	}
	
	public void prn() {
		System.out.println("========����ó��======");
		System.out.println("�й� ���� ���� ���� ���� ���");
		System.out.println("--------------------");
		for (int i=0 ; i<kor.length ; i++) {
			System.out.println(no[i] + " " + name[i] + " " + kor[i] + " " + eng[i] + " " + tot[i] + " " + avg[i]);
		}
	}
}





