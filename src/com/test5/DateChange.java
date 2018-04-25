package com.test5;


import java.util.Scanner;

public class DateChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner t=new Scanner(System.in);
   int n=t.nextInt();
   int x=n/3600;
   int y=(n%3600)/60;
   int z=(n%3600)%60;
   
   System.err.println(x+":"+y+":"+z);
	}

}
