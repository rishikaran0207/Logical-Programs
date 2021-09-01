package com.Bridgelabz;
import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Random;

public class LogicalPrograms {
    public static int num,len;
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        System.out.println("Enter a value between 1 to 9:");
        len = cn.nextInt();
        System.out.println("No of random coupon you'd like:");
        num= cn.nextInt();
        couponcode(len,num);
    }

    public static void couponcode(int Length,int items) {
        char[] numbers = "1234567890".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new SecureRandom();
        for (int i = 0; i < items; i++) {
            for (int j = 0; j < Length; j++) {
                char n = numbers[random.nextInt(numbers.length)];
                sb.append(n);
            }
            String coupon = sb.toString();
            int d=i+1;
            System.out.println("Coupon number "+d+" is "+coupon);
            sb.delete(0,len);

        }
    }
}