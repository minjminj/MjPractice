/*
 * �ٸ� Ű�� �ν�
 * 2018.05.02(�����)
 */
package chap10;

import java.util.HashMap;

public class P462_KeyExample {

	public static void main(String[] args) {
		// P461_Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<P461_Key, String> hashMap = new HashMap<P461_Key, String>();
		
		// �ĺ�Ű "new P461_Key(1)" �� "ȫ�浿"�� ������
		hashMap.put(new P461_Key(1), "ȫ�浿");
		
		// �ĺ�Ű "new P461_Key(1)" �� "ȫ�浿"�� �о��          
		String value = hashMap.get(new P461_Key(1));
		System.out.println(value);
		
	}
}
