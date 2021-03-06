package yusuf.com;

import java.util.Scanner;

public class prime_numbers {
	
	public static void main(String[] args) {
		
		int number, i, k, counter=0;
		
		 String  prime_numbers = "";
		 String deneme = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		number = sc.nextInt();
		
		for(k=number; k>1; k--) {	
			counter = 0;
		   for(i=1; i<=k; i++) {
			
			   if(k%i == 0) {
				   counter++;
			   }
	    	}
		   if(counter == 2) {
			   	prime_numbers = prime_numbers.concat(String.valueOf(k));
			   	prime_numbers = prime_numbers.concat(" ");
		   }
		}   
		System.out.print(number+" -> ");
		System.out.println(prime_numbers);
		System.out.println("all done.");
		}
	

}
