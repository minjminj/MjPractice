/*
 * 1부터 100까지 합을 계산하는 스레드
 * 2018.05.08(김민정)
 */
package chap11;

public class P607_SumThread extends Thread {

	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	public void run() {
		for(int i=1 ; i<=100 ; i++) {
			sum += i;
		}
	}
}
