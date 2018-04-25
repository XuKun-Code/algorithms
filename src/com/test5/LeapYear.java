package com.test5;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=new Scanner(System.in).nextInt();

if(  (n%4==0 && n%100!=0) || n%400==0) {
	System.err.println("yes");
}else {
	System.out.println("no");
}
		
	}

}
