package week1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Setintersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {3,2,11,4,6,7};
		Integer[] b= {1,2,8,4,9,7};
		
		
		Set <Integer> a1 = new HashSet<Integer>(Arrays.asList(a));
		
		System.out.println(a1); 
		
         Set <Integer> b1 = new HashSet<Integer>(Arrays.asList(b));
         
         System.out.println(b1); 
         
         a1.retainAll(b1); {
        	 
        	 System.out.println("the Maetching Value in Set "+ a1);
         }
		
		
}
	
}
