package com.test5;

import java.util.Arrays;
import java.util.Scanner;

public class Rank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(); //ÊäÈëÕûÊın
       int[] a =new int[n];
       int i=0;
       for(i=0;i<n;i++) {
    	   a[i]=sc.nextInt();
       }
       Arrays.sort(a);
       for(i=0;i<n;i++) {
    	   System.out.print(a[i]+" ");
       }
       
	}

}
