/*�� ����� ������ �����ϴ� Ŭ������ Ȱ���� x���� ������ �� ���� ����� �� �ִ�.
 * 2018.04.24(�����)*/
package chap5;

public class ArrayEx3_1 {

	String no; //�й�
	String name; //�̸�
	int k; //����
	int e; //����
	int t;
	double a;
	char grade; //����
	
	public ArrayEx3_1(String no, String name, int k, int e) {	//���� ����
		
		this.no = no;
		this.name = name;
		this.k = k;
		this.e = e;
		
		compute();
		setGrade(a);
		prn();
	}
	
	public void compute() {
		t = k + e;
		a = (double)t / 2;
	}
	
	public char setGrade(double a) {
		char g = 'F';
		
		if (a > 90) 		g = 'A';
		else if (a > 80) 	g = 'B';
		else if (a > 70)	g = 'C';
		else if (a > 60)	g = 'D';
		
		return g;
	}
	
	public void prn() {	//���
		System.out.println(no + " "
				+ name + " "
				+ k + " "
				+ e + " "
				+ grade + '\n');
						
	
	}



public static void main(String[] args) {
	new ArrayEx3_1("ii", "ee", 90, 32);
	
}
}
