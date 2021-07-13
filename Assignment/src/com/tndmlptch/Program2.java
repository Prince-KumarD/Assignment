package com.tndmlptch;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a = ");
		int num = sc.nextInt();
		int count = 1;
		String res = "";
		for (int i = 0; i < num; i++) {
			res = res + count + ", ";
			count = count + 2;
		}
		System.out.println(res);
	}
}
