package SlidenerdPractise;

import java.util.Scanner;

public class DecimalToOctal {
    public String decimalToOctal(int number){
        String octal = " ";
        if(number == 0){
            return "0";
        }
        while(number> 0){
            int remainder = number%8;
            octal = remainder + octal;
            number = number/8;
        }
        System.out.println(octal);
        return octal;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        DecimalToOctal od = new DecimalToOctal();
        od.decimalToOctal(668);
    }
}
