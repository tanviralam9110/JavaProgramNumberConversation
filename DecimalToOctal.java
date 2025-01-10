package jspider.NumberConverstion;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number");
        int num= sc.nextInt();
        System.out.println(num+" Octal is : "+covertDecimalToOctal(num));
    }
    public static String covertDecimalToOctal(int num){
        String Oct=" ";
        while (num > 0) {
            int  rem = num % 8;
            Oct=rem+Oct;
            num = num / 8;
        }
        return Oct;
    }
    }

