package assignments60;

import java.util.Arrays;

public class NumberisAnagaram {

	public static void main(String[] args) {
		int a1=123;
		int a2= 321;
		
		String b1= String.valueOf(a1);
		String b2= String.valueOf(a2);
		
	if(b1.length()!=b2.length()) {
		
		System.out.println("Not anagram");
	}
	
	else {
		System.out.println(" anagram");
		
		char[] c1=b1.toCharArray();
		char[] c2=b1.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			System.out.println(" anagram");
			
		}
		else {
			System.out.println("Not anagram");
		}
		
	}
		

	}

}
