/*
 * 배열 속의 배열
 */
package chap5;

public class P164_ArrayInArrayExample {

	public P164_ArrayInArrayExample() {
		
		int[][] mathscores = new int[2][3];
		
		for (int i=0 ; i<mathscores.length ; i++){
			for (int k=0 ; k<mathscores[i].length ; k++) {
				System.out.println("mathscores [" + i + "] [" + k + "]=" + mathscores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishscores = new int[2][];
		englishscores[0] = new int[2];
		englishscores[1] = new int[3];
		
		for (int i=0 ; i<englishscores.length ; i++) {
			for (int k=0 ; k<englishscores[i].length ; k++) {
				System.out.println("englishscores[" + i + "] [" + k + "]=" + englishscores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javascores = { {95,80}, {92,96,80} };
		
		for (int i=0 ; i<javascores.length ; i++) {
			for (int k=0 ; k<javascores[i].length ; k++) {
				System.out.println("javascores[" + i + "] [" + k + "]=" + javascores[i][k]);
			}
		}
	}
}
