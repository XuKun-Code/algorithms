package com.test5;

import java.util.Scanner;

public class StringContrast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
		String  str1=sc.nextLine();
		String  str2=sc.nextLine();
			if(str1.length()!=str2.length() ) {
				System.err.println("1");
			}
			else if (str1.length()==str2.length() && str1.equals(str2) ){
				System.err.println("2");
			}
            else if(str1.length()==str2.length() &&  str1.equals(str2)==false && str1.toLowerCase().equals(str2.toLowerCase())){
            	System.err.println("3");
            	System.out.println();
			}
			else {
				System.out.println("4");
				
			}
					 
	}

}
