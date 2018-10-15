/*
 * P154
 * main[]�ȿ� �����ϴ� �ڵ带 �����ڿ� �ۼ�
 * public static int add(int[] scores){...}�� public int add(int[] scores){...}�� �ٲٱ�
 * add()�� ���ؼ� ���� �հ踦���޹޾� ����� �����ϴ� avg(...) �Լ��� �߰�
 * ArrayTest.java�� �����غ���
 * �ۼ�����: 2018.04.23
 */
package chap5;

public class ArrayCreate {
	
	public ArrayCreate() {
		
		int [] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		for (int i=0 ; i<3 ; i++) {
			sum1 += scores[i];
		}
		System.out.println("����: " + sum1);
		
		int sum2 = add( new int[] {83, 90, 87});
		System.out.println("����: " + sum2);
		System.out.println();
		System.out.println("���: " + avg(sum2));
				
	}
	
	public int add(int[] scores){
		int sum = 0;
		for (int i=0 ; i<3 ; i++) {
			sum += scores[i];
		}
		
		return sum;
	}
	
	public double avg(int k) {
		double avg;
		avg = k / 3.0;
		
		return avg;
	}
	
}
