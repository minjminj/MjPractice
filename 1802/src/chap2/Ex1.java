package chap2;

public class Ex1 {
	//������
	int kor, eng, mat;

	public static void main(String[] args) {
		int kor;
		int eng;
		int mat;
		
		Ex1 e = new Ex1();
		// ex1 Ŭ������, e ��ü��(object: �ν��Ͻ�ȭ), new ��ü����������,
		//ex1() ������(Ŭ���� ��� �Ȱ��� �޼ҵ�-��ü�� �����ɶ� �� ����� �ϴ� �޼ҵ�-��� Ŭ������ �����ڸ� ���� ��ü�� �������)
		//static�� Ư���� ex1�� �޸𸮿� ����Ǳ� ���� main �Լ����� �޸𸮿� ����. 
		//�׷��� ������ ������ class ex1�� ��ü������ ���� �ҷ����� ������ ���� ���� ����.
		//Ŭ������ �����Ͻ� �Ҷ��� main �Լ��� ���� �Ʒ��� ��õǾ� �ִ� ��� Ŭ���� ������ �Բ� �޸𸮿� ����Ǵ� ��.
		
		
		
		//������ ������ ���� ����
		e.kor = 90;
		e.eng = 80;
		e.mat = 99;
		
		//������ ������ ���� ����
		kor = 55;
		eng = 66;
		mat = 77;
		
		
		System.out.println(e.kor); // e�� ���� kor, eng, mat �������� �� ����
		System.out.println(e.eng);
		System.out.println(e.mat);
		
		System.out.println(kor); // �ڱ� �ڽ��� ������ �ִ� �� �������� �� ���
		System.out.println(eng);
		System.out.println(mat);
		
		
	}

}