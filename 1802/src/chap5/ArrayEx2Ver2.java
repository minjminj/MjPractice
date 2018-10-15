/*
 * �迭���� �Ű������� ��ȯŸ������ �ۼ��غ���
 * ��� �迭�� �ν��Ͻ������� ����
 * �����ڿ��� �й�, ����, ����, ���� �ʱⰪ ����
 * void compute(int[] k, int[] e) ���·� ���� ���� �迭�� ���� ���� �迭�� �Ű������� ���޹޾� ����, ��� ���
 * char[] setGrade(double[] avg) ���·� ����� �Ű������� �޾� ������ ���Ͽ�, char[] Ÿ������ ��ȯ�޾� grade�� ���� (������ �Ϲ����� ������� A~F����)
 * void prn()�� ����Ͽ� ���� ��� (��� ������ ���Ƿ� ����)
 * ������: new ArrayEx2();
 * 
 * 2018.04.24(�����)
 */
package chap5;

public class ArrayEx2Ver2 {
	
	String[] no;	// �й�
	String[] name;	// ����
	int[] kor;		// ����
	int[] eng;		// ����
	int[] tot;		// ����
	double[] avg;	// ���
	char[] grade;	// ����

	public ArrayEx2Ver2() {		// ������ �������� �迭�� �ʱⰪ ����
	
		no = new String[5];	
		name = new String[5];	
		kor = new int[5];	
		eng = new int[5];	
		tot = new int[5];
		avg = new double[5];
		
		for (int i=0 ; i<no.length ; i++) {
			int r = (int)(Math.random()*100+1);
			int k = (int)(Math.random()*100+1);
			int e = (int)(Math.random()*100+1);
			
			no[i] = "n" + r;
			name[i] = "name" +r;
			kor[i] =k;
			eng[i] =e;
		}
		/* compute�� Ŭ���� �ۿ� �ִ� �޼ҵ���..
		 * ArrayEx2.ex2 = new ArrayEx2();
		 * ae2.compute(ae2.kor, ae2.eng);
		 * ��, kor, eng�� ������ �����̱� ������ ����. ������ ������ �Ұ���.
		 */
	
		compute(kor, eng);		// ���� �� ��� ���
		grade = setGrade(avg);
		prn();					// ���
		
		
	}
	
	public void compute(int[] k, int[] e) {		// �Ű������� ���޹��� ������� ������� �̿��Ͽ� ���� �� ��� ���ϱ�.
		
		
		for (int i=0 ; i<no.length ; i++) {	
			tot[i] = k[i] + e[i];
			avg[i] = tot[i] / 2.0;
		}
	}
	
	public char[] setGrade(double[] avg) {		// �Ű������� ���޹��� ����� �̿��� char[]Ÿ������ ���� ���ϰ�, grade�� �����ϱ�.
		
		grade = new char[no.length];
		
		for (int i=0 ; i<no.length ; i++) {		// ��� �����뿡 ���� ���� ����
			
			
			if (avg[i] > 90) {
				grade[i] = 'A';		
			} else if (avg[i] > 80) {
				grade[i] = 'B';
			} else if (avg[i] > 70) {
				grade[i] = 'C';
			} else if (avg[i] > 60) {
				grade[i] = 'D';
			} else {
				grade[i] = 'F';
			}
		}
		
			return grade;
	}
	
	public void prn() {
		
		System.out.println("============= ����  ó�� ===============");
		System.out.println(" �й� | �� �� | ���� | ���� | ���� |  ���  | ����");
		for (int i=0 ; i<no.length ; i++) {
			System.out.println(no[i] + " | " + name[i] + " | " + kor[i] + " | " + eng[i] + " | " + tot[i] + " | " + avg[i] + " | " + grade[i]);
		}
		System.out.println("-------------------------------------");
		
	}
}
