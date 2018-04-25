package com.test5;
import java.util.Scanner;
public class Summation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
double n=sc.nextDouble();

	
    double x=n+(n*(n-1))/2;
    System.out.println((long)x);

	}

}
