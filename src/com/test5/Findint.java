package com.test5;

import java.util.Scanner;  
public class Findint {  
public static void main(String args[]) {  
    Scanner n=new Scanner(System.in);
    int[] a=new int[1000];
    int ones=n.nextInt();
    int i=0;
    for(i=0;i<ones;i++) {
    	a[i]=n.nextInt();
    }
    int x=n.nextInt(); //������Ҫ���ҵ���
    int  y=-1;
    for(i=0;i<ones;i++) {
    	if(a[i]==x) {
    		 y=i+1;
    		break;
    	}
    }
    
 System.err.println(y);
}  
}  
