package min_min;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
	
	public static void main(String[] args) {
		Test t = new Test();
		// 정규식
		String id = "(?=.*[0-9])(?=.*[a-zA-Z]).{2,}$"; // 영숫자 8~20자리
		String name = "^[a-zA-Z]{3,20}|[가-힣]{3,20}$"; // 한글 또는 영어 3~20자리
		String score = "^[0-9]{1,2}|100$"; // 정수 0~100점까지
		
		// id 정규식 test
		String input_id_t = "minjeong123";
		String input_id_f = "이건 안돼"; // 영숫자 이외의 한글이 포함됨.
		
		System.out.println("id");
		boolean id_t = Pattern.matches(id, input_id_t);
		boolean id_f = Pattern.matches(id, input_id_f);
		t.test(id_t);
		t.test(id_f);
		
		// name 정규식 test
		String input_name_t = "김민정";
		String input_name_t2 = "Elena";
		String input_name_f = "안된다123"; // 한글과 숫자가 조합됨.
		String input_name_f2 = "가나다라마바사아자차카타파하가나다라마바사아자차카타파하";
								// 글자수가 최대범위인 20자리를 초과함.
		
		System.out.println("name");
		boolean name_t = Pattern.matches(name, input_name_t);
		boolean name_t2 = Pattern.matches(name, input_name_t2);
		boolean name_f = Pattern.matches(name, input_name_f);
		boolean name_f2 = Pattern.matches(name, input_name_f2);
		t.test(name_t);
		t.test(name_t2);
		t.test(name_f);
		t.test(name_f2);
		
		// score 정규식 test
		String input_score_t = "78";
		String input_score_t2 = "100";
		String input_score_f = "999"; // 최대 범위 초과.
		String input_score_f2 = "이건 숫자가 아녀"; // 숫자 이외의 내용.
		
		System.out.println("score");
		boolean score_t = Pattern.matches(score, input_score_t);
		boolean score_t2 = Pattern.matches(score, input_score_t2);
		boolean score_f = Pattern.matches(score, input_score_f);
		boolean score_f2 = Pattern.matches(score, input_score_f2);
		t.test(score_t);
		t.test(score_t2);
		t.test(score_f);
		t.test(score_f2);
	
		Scanner sc = new Scanner(System.in);
		System.out.println("id를 입력하세요");
		String scan = sc.nextLine();
		boolean i = Pattern.matches(id, scan);
		t.test(i);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String scan1 = sc1.nextLine();
		boolean n = Pattern.matches(name, scan1);
		t.test(n);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("스코어를 입력하세요");
		String scan2 = sc2.nextLine();
		boolean s = Pattern.matches(score, scan2);
		t.test(s);
	}
	
	public void test(boolean b) {
		if(b) {
			System.out.println("정규식 통과");
		} else {
			System.out.println("정규식 조건에 맞게 작성하세요");
		}
	}
}
