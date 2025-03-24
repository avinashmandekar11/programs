import java.util.*;

public class max {
    public static void main(String[] args) {
        // int []arr={1,9,3,7,2};
        // int a=0;
        // int max=100;
        
        // for(int i=0;i<5;i++){
        //  a=arr[i];
        // if(a<max)
        // max=a;
         
        //  }
        
        //  System.out.println(max);



        // package com.array;
       
        // import java.util.Iterator;
        
        
            Scanner sc = new Scanner(System.in);
                    int n=sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <=n; j++) {
                System.out.print(" ");	
                }
                for (int j = 1; j <=i; j++) {
                    if(j==1 || j==i||i==n)
                    System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
           
        }


        }




    }

