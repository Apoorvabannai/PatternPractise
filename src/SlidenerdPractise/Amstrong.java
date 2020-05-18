package SlidenerdPractise;

import java.util.Scanner;

public class Amstrong {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int temp = number;
        String l = temp +"";
        int length = l.length();
        System.out.println(length);
        int  sum = 0;
        while (temp!= 0 ){
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit,length);
            System.out.println("Sum is "+ sum);
            temp = temp/10;
        }
        if( sum == number){
            System.out.println("Its armstrong");
        }
        else{
            System.out.println("Its not a Armstrong number");
        }
    }

}
