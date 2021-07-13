package com.tndmlptch;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a = ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			int count = 1;
			String res = "";
			for (int i = 0; i < num-1; i++) {
				res = res + count + ", ";
				count = count + 2;
			}	
			System.out.println(res);
		} else {
			int count = 1;
			String res = "";
			for (int i = 0; i < num; i++) {
				res = res + count + ", ";
				count = count + 2;
			}
			System.out.println(res);
		}
		
		
		
	}
}
