/*
 * Format Ŭ������ �̿��Ͽ� ���ڸ� ���ϴ� �������� ����ϱ�
 * 2018.05.08(�����)
 */

package chap11;

import java.text.DecimalFormat;


public class P544_DecimalFormatExample {
	
	public static void main(String[] args) {
		
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");		// ���ڸ��� 0���� ä��
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");					// ���ڸ� ä���� ����.
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
				
		df = new DecimalFormat("+#.0");					// ��� ��ȣ
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");					// ���� ��ȣ
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");				// �ڸ��� ��Ÿ����
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0");				// E�� ��������
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#,### ; -#,###");		// ����϶��� +, �����϶��� -
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.# %");				// *100 �Ŀ� % ����
		System.out.println(df.format(num));
		
		df = new DecimalFormat("\u00A4 #,###");			// ��ȭ ��ȣ ǥ��
		System.out.println(df.format(num));
	}

}
