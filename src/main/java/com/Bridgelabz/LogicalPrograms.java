package com.Bridgelabz;
import java.util.Scanner;
public class LogicalPrograms {

    public static void main(String[] args){
       // System.out.println("Logical Programming");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 4 number to reverse");
        int num =sc.nextInt();
        int newnum=0;
        while(num!= 0) {
            newnum = newnum * 10;
            newnum = newnum+ num%10;
            num = num / 10;
        }
        System.out.println("\nThe reversed number is "+newnum);

    }
}

