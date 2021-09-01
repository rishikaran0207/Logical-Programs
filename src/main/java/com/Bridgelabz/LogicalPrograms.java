package com.Bridgelabz;
import java.util.Scanner;
public class LogicalPrograms {
    public static void main(String[] args){
       // System.out.println("Logical Programming");
        System.out.println(" Fibonnacci ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Type ' s ' to Start :");
        long start = System.currentTimeMillis();
        sc.nextLine();
        System.out.print("Type ' p ' to Stop :");
        sc.nextLine();
        long stop = System.currentTimeMillis();
        long Elapsedtime = (stop - start) / 1000;
        System.out.print("Elapsed Time was: "+Elapsedtime+" Seconds");
    }
}

