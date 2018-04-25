package com.test5;


import java.util.Arrays;
import java.util.Scanner;

public class NumberCharacteristic {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int[] a = new int[n];
		int  num=0;
		int i=0;
		for( i=0;i<n;i++) {
				a[i] =x.nextInt();
				num=num+a[i];	
		}
		
		Arrays.sort(a);
		System.out.println(a[n-1]);
		System.out.println(a[0]);
		System.out.println(num);
		
//	int mix=a[0];
//	int max=a[0];
//	for(i=0;i<n;i++) {
//	    if(a[i]>max) {
//	    	max=a[i];
//	    }
//	    if(a[i]<mix) {
//	    	mix=a[i];
//	    }
//	}
//System.out.println(max);
//System.out.println(mix);
//System.out.println(num);
	    
		
	}
}
