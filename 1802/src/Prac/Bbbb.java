package Prac;

import java.util.Arrays;

public class Bbbb {
	
	String [] s1 = {"java", "jsp", "db", "ajax", "mybatis"};
	String temp = "";
	
	public Bbbb() {
		for (int i=0 ; i<s1.length-1 ; i++) {
			for (int j=(i+1) ; j<s1.length ; j++) {
				 
				if (s1[i].compareTo(s1[j])>0) {
					temp = s1[i];
					s1[i] = s1[j];
					s1[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(s1));
	}

	public static void main(String[] args) {
		new Bbbb();
	}
}
