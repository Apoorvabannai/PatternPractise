package SlidenerdPractise;

import java.util.Scanner;
// perfect numbers is sum of factors equals number.
public class PerfectNumber {
     static void perfectNumber(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int sum = 0;
         double num = sc.nextInt();
         for( int i =1; i<= num;i++){
             double result = num/i;
             if(result == Math.ceil(result)){
                 sum = sum+(int)result;
             }
         }
         sum = (int) (sum - num);
         if( sum == num){
             System.out.println(" perfect Square");
         }

     }
     public static void main(String[] args){
         perfectNumber();
     }

}
