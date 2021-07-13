package com.tndmlptch;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of element ");
		int noe = sc.nextInt();
		int[] arr = new int[noe];
		int count_1,count_2,count_3,count_4,count_5,count_6,count_7,count_8,count_9;
		count_1 = count_2 = count_3 = count_4 = count_5 = count_6 = count_7 = count_8 = count_9 = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] % 1 == 0) {
				count_1++;
			}
			if(arr[i] % 2 == 0) {
				count_2++;
			}
			if(arr[i] % 3 == 0) {
				count_3++;
			}
			if(arr[i] % 4 == 0) {
				count_4++;
			}
			if(arr[i] % 5 == 0) {
				count_5++;
			}
			if(arr[i] % 6 == 0) {
				count_6++;
			}
			if(arr[i] % 7 == 0) {
				count_7++;
			}
			if(arr[i] % 8 == 0) {
				count_8++;
			}
			if(arr[i] % 9 == 0) {
				count_9++;
			}
		}
		StringBuffer sb = new StringBuffer();
		sb.append("{ 1 : "+ count_1).append(", 2 : "+ count_2).append(", 3 : "+ count_3).append(", 4 : "+ count_4).append(", 5 : "+ count_5).append(", 6 : "+ count_6).append(", 7 : "+ count_7).append(", 8 : "+ count_8).append(", 9 : "+ count_9 + " }");
		System.out.println(sb.toString());
	
		}
	}