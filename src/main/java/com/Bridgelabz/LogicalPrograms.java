package com.Bridgelabz;
import java.util.Scanner;
public class LogicalPrograms {

    public static void main(String[] args){
       // System.out.println("Logical Programming");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num =sc.nextInt();
        int flag=1;
        if(num==1||num==2||num==3)
            System.out.println("The number is Prime number");
        else {
            for (int i = 2; i <num; i++) {
                if (num % i ==0 )
                    flag = 0;
            }
            if (flag == 1)
                System.out.println("The number is a Prime number");
            else
                System.out.println("The number is not a Prime number");
        }
    }
}

