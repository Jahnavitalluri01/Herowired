package Assignment2;

import java.util.Scanner;

public class Cumilative {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of array:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array Elements:");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
       
        int sum=0;
        for(int i=0; i<n; i++){
              a[i]=a[i]+sum;
              sum=a[i];
              System.out.print(sum+" ");
        }
    }
}
