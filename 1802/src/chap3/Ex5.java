package chap3;
//������ ������ 3���� ���� �������� ���� ���
public class Ex5 {
	public static void main(String[] args) {
		int[] A= {3,5,9,13,15,22};
		int b; //��
		int c; //������
		int i;
		int L=A.length;
		
		for (i=0; i<L; i++) {
			b= A[i] / 3;
			c= A[i] % 3;
			
			System.out.println("�Է°�: " +A[i]);
			System.out.println("��: " +b);
			System.out.println("������: "+c +'\n');
		}
		
		
		
		
		
	}
}
