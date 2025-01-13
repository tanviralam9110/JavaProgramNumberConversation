package jspider.NumberConverstion;

import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        String num= sc.next();
        System.out.println(ConvertHexadecimalToDecimal(num));
    }

    public static String ConvertHexadecimalToDecimal(String str) {
        int dec = 0;
        int sixteenMultiple = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                dec = dec + (c - 48) * sixteenMultiple;
            } else if (c >= 'A' && c <= 'F') {
                dec = dec + (c - 55) * sixteenMultiple;
            } else if (c >= 'a' && c <= 'f') {
                dec = dec + (c - 87) * sixteenMultiple;
            } else
                return "Illegel input hexadecimal is 0-F";
            sixteenMultiple*=16;
        }
        return "Decimal of "+str+" is: "+dec;
    }
}