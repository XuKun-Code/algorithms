package com.test5;

import java.util.Scanner;

public class Palindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// for(int i=1000;i<10000;i++) {
//	 int x=i/1000;
//	 int y=(i%1000)/100;
//	 int z=((i%1000)%100)/10;
//	 int r=((i%1000)%100)%10;
//	  if( x==r && y==z) {
//		 System.out.println(i);
//	 }
// }
		Scanner x= new Scanner(System.in);
		int a=x.nextInt();
		for(int i=1;i<=9;i++)  { 
            for(int j=0;j<=9;j++) {
            	for(int k=0;k<=9;k++) {
//                System.out.println(i*10000+j*1000+k*100+j*10+i);
	        //    System.out.println(i*100000+j*10000+k*1000+k*100+j*10+i);
            		
            if((i+i+j+j+k)==a && 1<=a && a<=54  ) {
//            	
            	 System.out.println(i*10000+j*1000+k*100+j*10+i);
    
              }}}}
            
			
		for(int i=1;i<=9;i++)  { 
            for(int j=0;j<=9;j++) {
            	for(int k=0;k<=9;k++) {
//                System.out.println(i*10000+j*1000+k*100+j*10+i);
	        //    System.out.println(i*100000+j*10000+k*1000+k*100+j*10+i);
            		
            		if((i+i+j+j+k+k)==a && 1<=a && a<=54  ){
            			 System.out.println(i*100000+j*10000+k*1000+k*100+j*10+i);
            				
    
              }}}}
		
//            if((i+i+j+j+k+k)==a && 1<=a && a<=54  ){
////            int w =i*100000+j*10000+k*1000+k*100+j*10+i;
//            	  System.out.println(i*100000+j*10000+k*1000+k*100+j*10+i);
			
		}
            
            	
	}


