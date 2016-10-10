package com.acadgild.aatika.java.session4;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = s.next();
		System.out.println("You have entered : "+str);
		String reverse = new StringBuffer(str).reverse().toString();
		
		System.out.println("The reverse of your String is : "+reverse);

	}

}
