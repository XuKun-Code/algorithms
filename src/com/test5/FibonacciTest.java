package com.test5;
import java.util.Scanner;

public class FibonacciTest {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 	 
	int[] a=new int[1000000];
	a[1]=1;
	a[2]=1;
	
	for(int i=3;i<=n;i++) {
		a[i]=(a[i-1]+a[i-2])%10007;
		
	}
	
	  System.out.println(a[n]);
}
	
	
	
	
}
