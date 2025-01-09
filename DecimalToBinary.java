package jspider.NumberConverstion;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println( convertDecimalToBinary(num));
    }
    public static String convertDecimalToBinary(int num){
        String bin=" ";
        while (num > 0) {
          int  rem = num % 2;
           bin=rem+bin;
            num = num / 2;
        }
       return bin;
    }
}
