/*
 *���̿� ������ ���� ������ ������ ������ ������ ����Ǿ� �ִ�.
 * ���̰� 20�� �̰ų� ������ ����(true)�̸� "����Ʈ ����", �׷��� ������ "����ǰ ����"�� ����Ͻÿ�.
// �ʵ�� �޼ҵ�� ����. �ʵ�: ��纯��. �޼ҵ�: compute(int age, boolean men) �޼ҵ�� ���޹��� ���� �ʵ忡 ������ ��
 *  "����Ʈ ����" �Ǵ� "����ǰ ����"�� ���. 
 */
package chap4;

public class AA{
	
	int age;
	boolean men;
	
	public void compute(int age, boolean men) {
		this.age = age;
		this.men = men;
		
		if ( (age >=20 && age <=29) || men ) {
			System.out.println("����Ʈ ����");
		} else {
			System.out.println("����ǰ ����");
		}
	}
	
	
}