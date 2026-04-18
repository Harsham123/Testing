package assignments60;

public class Numberispalindrome {

	public static void main(String[] args) {
		int a1=123;
		
		
		String b1= String.valueOf(a1);
		String b2= "";
		
		for(int i=b1.length()-1; i>=0; i--) {
			
			char c1=b1.charAt(i);
			b2= b2+c1;
		}
		
		if(b1==b2) {
			
			System.out.println("Palindromr");

		}
		else
		{
			System.out.println(" Not Palindromr");
		}

	}

}
