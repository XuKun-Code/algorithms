package com.test5;

import java.util.Scanner;

public class SixteenChangeTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.err.println(Long.parseLong(str,16));
	}

}
