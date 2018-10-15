/*
 * �������� Ŭ���� ��� ���� ���
 */
package chap11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class P491_ReflectionExample {

	public static void main(String[] args) throws Exception {
		
		Class clazz = Class.forName("chap11.P469_Member2");
		
		 
		
		System.out.println("[Ŭ���� �̸�]");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("[������ ����]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
    		printParameters(parameters);
			System.out.print(")");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("[�ʵ� ����]");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();
		
		System.out.println("[�޼ҵ� ����]");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName()+ "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		
		
	}
	
	private static void printParameters(Class[] parameters) {
		for (int i=0 ; i<parameters.length ; i++) {
			System.out.print(parameters[i].getName());
			if (i<(parameters.length-1)) {
				System.out.print(",");
			}
		}
	}
	
	
}