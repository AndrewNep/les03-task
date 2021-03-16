package by.http.les01.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	    
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("введите а>");
		 while(!sc.hasNextInt()) {
	     System.out.println("введите a>");
	     sc.next();
		 }
		 
		 a = sc.nextInt();
		 
		 System.out.println("введите b>");
		 while(!sc.hasNextInt()) { 
		 System.out.println("¬ведите b>");
		 sc.next();
		 }
		
		 b = sc.nextInt();
		 
		 
		 System.out.println("введите c>");
		 while(!sc.hasNextInt()) {
	     System.out.println("введите c>");
	     sc.next();
		 }
		 
		 c = sc.nextInt();
		 
		 System.out.println((b + Math.sqrt(b * b + (4 * a * c))/ (2 * a)) - (Math.pow(a, 3) * c) + b);
	     }	
	}
