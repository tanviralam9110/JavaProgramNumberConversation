package jspider.NumberConverstion;
import java.util.Scanner;
public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the number");
        int num= sc.nextInt();
        System.out.println(convertDecimalToHexadecimal(num));
    }
    public  static String convertDecimalToHexadecimal(int num){
        String hex=" ";
        while (num>0){
            int rem=num%16;
            if (rem<=9) {
                hex = rem + hex;
            }
            else{
                hex=((char)(rem+55)+hex);
            }
            num=num/16;

        }
        return hex;
    }
}
