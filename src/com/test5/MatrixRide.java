package com.test5;

public class MatrixRide {
	  
    public static void main(String[] args) {   
        int []p = {30,35,15,5,10,20,25};//��������������  
    //p[i]�ĺ���������ָ���ǣ�  
    //1. ��i���������  
    //2. ��i+1���������  
        int [][]m = new int [p.length+1][p.length+1];//��¼���˴���  
        int [][]s = new int [p.length+1][p.length+1];//��¼��ѷָ�λ��  
        MatrixChain(p,m,s);  
        System.out.println("�����������С��������");  
        PrintMatrixMul(m,p.length);  
        System.out.println("�����M��������ŶϿ�λ�þ���S");  
        PrintMatrixMul(s,p.length);  
        System.out.println("�˷������Ŵ���");  
        traceback(s,1,p.length-1);  
    }  
    private static void PrintMatrixMul(int[][] m,int n) {  
        //��ӡ����  
        for(int i = 1;i<=n-1;i++){  
            for(int j =1;j<=n-1;j++){  
                System.out.print(m[i][j]+"\t");  
                if(j % (n-1) ==0)System.out.print("\n");  
            }  
        }  
          
    }  
    public static void MatrixChain(int []p,int [][]m,int [][]s){  
        //��������ֵ  
        for(int i=1;i<=p.length;i++){  
            m[i][i]=0;  
        }         
        for(int r = 2; r<= p.length;r++){  
            for(int i=1;i<=p.length-r;i++){  
               int j = i+r-1;  
               m[i][j] = m[i+1][j]+p[i-1]*p[i]*p[j];  
               s[i][j] = i;  
               for(int k =i+1;k<j;k++){  
                   int t = m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];  
                   if(t<m[i][j]){  
                       m[i][j] = t;  
                       s[i][j]=k;  
                   }  
               }  
            }  
              
        }  
    }  
    private static void traceback(int[][] s, int i, int j) {  
        //������ż������  
                //�۲��ĸ�ʽ���������ֻ�е�����A����ôֻҪ���Ai��ǰ���������  
                //�����������A���������i+1=j����ô��ʱ��Ҫʹ������    
                //�ڷָ��������á��������ڷָ���ұ����á�����,��ʱ���õݹ�ȥ���ʹ�����ŵ�λ��   
                if(i==j)   
                    System.out.print("A"+i);      
                else if(i+1==j)   
                    System.out.print(" (A"+i+" * "+" A"+j+") ");     
                else{       
                    System.out.print(" (");     
                    traceback(s,i,s[i][j]);     
                    traceback(s,s[i][j]+1,j);        
                    System.out.print(") ");      
                }  
                  
                  
    }  
} 