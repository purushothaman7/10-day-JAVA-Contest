import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("enter no of shapes");
        int n=sc.nextInt();
        String a[]=new String[n];
        int b[]=new int[n];
        int c[]=new int[n];
        String s1="triangle";
        String s2="square";
        String s3="rectangle";
        for(i=0;i<n;i++){
            
            a[i]=sc.next();
        
             b[i]=sc.nextInt();
           
            c[i]=sc.nextInt();
            
           
        }
        for(i=0;i<n;i++){
            if(a[i].equals(s1)){
                System.out.println(b[i]*b[i]);
            }
            else if (a[i].equals(s2)){
                System.out.println(b[i]*c[i]);
            }
            else if(a[i].equals(s3)){
                System.out.println(0.5*(b[i]*c[i]));
                                   }
             else{
                 System.out.println("0");
             }                      
        }
        
        
       
        }
}
