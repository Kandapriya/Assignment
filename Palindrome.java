package week1;

public class Palindrome {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int n=121 ,sum=0, r;
		 int temp=n;
		 while(n>0) {
			 r= n % 10;
			 sum=(sum*10)+r;
			 n=n/10;
			 
		 }
			 if (temp==sum) {
				 System.out.println ("It is a Palindrome");
				
			} else {
				 System.out.println("It is not a Palindrome");
					

			} 
		
				 
					
				
			}
		
	}


