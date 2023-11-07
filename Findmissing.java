package week1;

import java.util.Arrays;

public class Findmissing {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int[] input = new int[]{1,4,3,2,8,6,7}; 
		
		Arrays.sort(input);
		
		System.out.println("sort value "+ Arrays.toString(input));
		
		n=8;
		
		int Total = (n*(n+1)/2);
		 
		int Sum=0;
		
		for(int i : input) {
			
			Sum += i;//sum=sum+i
			
			System.out.println(Sum);
		}
		 int v= Total-Sum;	
			System.out.println("The Missing Numbers is "+ v);
			
			
		}
	}
	

	
		
		
		
	
	
		
		
		
		
	

	
