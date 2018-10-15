package chap2;
//변수의 사용 범위 체크
	public class P37_VariableScopeExample {
		public static void main(String[] args) {
			int v1 = 15;
			if(v1>10) {
				int v2 = v1 - 10 ;
			}
//		int v3 = v1 + v2 + 5 ;
	}
}
