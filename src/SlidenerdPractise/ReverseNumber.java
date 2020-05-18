package SlidenerdPractise;

import java.util.Scanner;
import java.lang.*;

public class ReverseNumber {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
     methodOne();
     methodTwo();
    }
    public static  void  methodOne( ){
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int  number = sc.nextInt();
        StringBuffer b = new StringBuffer(number+ " ");
        b.reverse();
    }
    public static void methodTwo(){
        System.out.println("Enter number for method2");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int sum = 0;
        while (temp != 0){
            int digit = temp%10;
            System.out.print(digit);
            temp  = temp/10;
            sum += digit;
        }
        System.out.println("\n"+ sum);

    }
}
// in method when you do not mention static then in main method you cannot call it directly.