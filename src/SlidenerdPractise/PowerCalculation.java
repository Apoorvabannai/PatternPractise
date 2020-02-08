package SlidenerdPractise;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[]args){
        int base, power;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base ");
        base = sc.nextInt();
        System.out.println("Enter the power/ exponent");
        power = sc.nextInt();
        int  result  = 1;
        for( int i = 1; i <= power; i++){
             result = result * base;
        }
        System.out.println(  base+ " raised to " + power +" is:  "+ result);

    }

}
