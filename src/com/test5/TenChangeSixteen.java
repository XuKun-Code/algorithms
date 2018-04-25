package com.test5;

import java.util.Scanner;

public class TenChangeSixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a>=0&& a<=2147483647) {
System.out.printf("%X",a);
}
	}

}
