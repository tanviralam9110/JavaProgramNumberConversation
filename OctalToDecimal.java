package jspider.NumberConverstion;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        System.out.println(num+" The Decimal num is "+convertOctalToDecimal(num));
    }
    public static String convertOctalToDecimal(int num){
        int dec=0;
        int eightMultiple=1;
        while (num>0){
            int rem=num%10;
            if (rem<=7)
                dec=dec+rem*eightMultiple;
            else
            return "Illegal input! Octal should only 0-7";
            eightMultiple*=8;
            num=num/10;
        }
        return dec+" ";
    }
}
