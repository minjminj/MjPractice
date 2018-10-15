package chap4;

public class ForEx9_1 {

	public ForEx9_1() {
		
		int a,b;
		
		for (a=1 ; a<=5 ; a++) {
			
			for (b=1 ; b<=(6-a); b++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
}
