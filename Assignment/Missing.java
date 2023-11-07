package week1.Assignment;

import java.util.Arrays;

public class Missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  a= {1, 4,3,2,8, 6, 7};
		
		Arrays.sort(a); 
		
		System.out.println("Array Length is "+a.length);
		
		
		for (int i = 0; i < a.length; i++) { {
			System.out.println("sort array value is "+a[i]);
			
			
		}
			if (a[i]!=i+1) {
				System.out.println("\n");
				System.out.println("The Missing Value is "+(i+1));
				
				break;
	
			}
			
		}
		
		
		}

	}


