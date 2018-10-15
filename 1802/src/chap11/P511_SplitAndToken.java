/*
 * Stirng.split()�� StringTokenizer�� ������
 * (��ȿ�� ���� ���� ����)
 * 2018.05.04(�����)
 */
package chap11;

import java.util.StringTokenizer;

public class P511_SplitAndToken {

	public P511_SplitAndToken() {
		
		String text = "java,jsp,db,,,,,,,,ajax";
		
		// split �� ���� ����� String[] �� return
		String[] r1 = text.split(",");
		for (int i=0 ; i<r1.length ; i++) {
			String str = String.format("r1[%d]=%s", i,r1[i]);			
					// %: ���ڿ��� ��ġ, %d: ������ ��ġ, %f: �Ǽ��� ��ġ, %s: ������ ��ġ, %10s: ������ 10�ڸ��� ���� �� ���ڿ��� ����, %10d: ������ 10�ڸ��� ���� �� ������ ����.
					// %10.2f: ��ü �ڸ����� 10�ڸ���, 2�ڸ��� �Ҽ��� ������ �ڸ�.
		System.out.println(str);
		}
		
		System.out.println();
		
		// StringTokenizer ó�� ���
		StringTokenizer st = new StringTokenizer(text, ",");
		int p = 0;
		while (st.hasMoreTokens()) {
			String s= st.nextToken();
			String str = String.format("r1[%d]=%s", p,s);
			System.out.println(str);
			p++;
		}
		System.out.println();
	}
	
	public void test() {
		String text = "jave,jsp,/db@ajax,mybatis/spring,android///javascript";
	
		// , / @�� ����� ���
		
		// split
		String[] q1 = text.split(",|/|@");
								// �����ڸ� ���Խ����� ǥ���ؾ� �ϱ⶧���� | �ݵ�� �ʿ���.
		for (int i=0 ; i<q1.length ; i++) {
			String hi = String.format("q1[%d]=%s", i,q1[i]);
									// �������,     ��� ����
			System.out.println(hi);
		}
		System.out.println();
				
		// tokenizer
		StringTokenizer mj = new StringTokenizer(text, ",|/|@");
										// �����ڸ� ���ڷ� ǥ���ϱ� ������ | �ʿ���� ",/@" �� �Է��ص� ����.
		int m = 0;
		while (mj.hasMoreTokens()) {
			String j = mj.nextToken();
			String kmj = String.format("q1[%d]=%s", m,j);
			System.out.println(kmj);
			m++;
		}
	
	}
	
	public static void main(String[] args) {
		P511_SplitAndToken s = new P511_SplitAndToken();
		
		s.test();
	}
}









