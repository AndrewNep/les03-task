package by.http.les01.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	    
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("������� �>");
		 while(!sc.hasNextInt()) {
	     System.out.println("������� a>");
	     sc.next();
		 }
		 
		 a = sc.nextInt();
		 
		 System.out.println("������� b>");
		 while(!sc.hasNextInt()) { 
		 System.out.println("������� b>");
		 sc.next();
		 }
		
		 b = sc.nextInt();
		 
		 
		 System.out.println("������� c>");
		 while(!sc.hasNextInt()) {
	     System.out.println("������� c>");
	     sc.next();
		 }
		 
		 c = sc.nextInt();
		 
		 System.out.println((b + Math.sqrt(b * b + (4 * a * c))/ (2 * a)) - (Math.pow(a, 3) * c) + b);
	     }	
	}
