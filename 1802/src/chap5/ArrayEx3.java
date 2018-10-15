/*
 * �� ����� ������ �����ϴ� Ŭ������ Ȱ���� x���� ������ �� ���� ����� �� �ִ�.
 * 2018.04.24(�����)
 */
package chap5;


public class ArrayEx3 {
	String no;
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	char grade;
	
	public ArrayEx3(String no, String name, int k, int e) {
		this.no = no;
		this.name = name;
		this.kor = k;
		this.eng = e;
		compute(this.kor, this.eng);
		prn();
	}
	
	public void compute(int k, int e) {
		this.tot = k + e;
		this.avg = (double)this.tot / 2;
	}
	
	public char setGrade(double avg) {
		char c = ' ';
		if(avg >= 90)		c = 'A';
		else if(avg >= 80)	c = 'B';
		else if(avg >= 70)	c = 'C';
		else if(avg >= 60)	c = 'D';
		else				c = 'F';
		
		return c;
	}
	
	public String prn() {				 /*ArrayEx3 �� �ǽ����� void prn()�� ���·� ���������, FrameTest3���� �ܼ�â�� �ƴ� UIâ�� ����ϱ� ����,
		textArea.append() ����� ���. append�� �̿��� ����Ϸ��� �ݵ�� String Ÿ���̾�� �ϱ⶧���� ��ȯ�� String!*/
		
		String str = no + " "			// ���ٷ� �����ص� ��������� �ǹ̰� �и��Ǵ� �����̸� �ٹٲ� ���ָ� �м��ϱ� ����.
				+	name + " "			// " "�� ��ĭ ���� �Ϸ��� �ǵ��� ������ ""�� int Ȥ�� double Ÿ�� ���̿� �־��༭ �������� ������ �ʰ� �Ϸ��� �ǵ��� �ִ�.
				+	kor + " "
				+	eng + " "
				+	tot + " "
				+	avg + " "
				+	grade;
				
		return str;
	}
}
