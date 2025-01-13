package jspider.NumberConverstion;

import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number");
        int num= sc.nextInt();
        String decimal=convertBinaryToDecimal(num);
        System.out.println(decimal);
    }
    public static String convertBinaryToDecimal(int num){
        int dec=0;
        int twoMultiple=1;
        int originalNum=num;
        while (num>0){
            int rem=num%10;
            if (rem<=1)
                dec = dec + rem * twoMultiple;
            else
                return "Illegal Input/Binary should have only 0 or 1";
            twoMultiple*=2;
            num=num/10;
        }
       // return dec+" ";
        return "The Decimal of "+originalNum+" is :"+dec;
    }
}
