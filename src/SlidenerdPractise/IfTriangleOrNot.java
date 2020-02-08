package SlidenerdPractise;

import java.util.Scanner;

public class IfTriangleOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Side");
        int sideA = sc.nextInt();
        System.out.println("Enter the Second Side");
        int sideB = sc.nextInt();
        System.out.println("Enter the Third Side");
        int sideC = sc.nextInt();
        if(((sideA + sideB) > sideC) && ((sideA+sideC) > sideB) && ((sideB+sideC) > sideA)) {
            System.out.println("Yes it forms a Triangle ");
            Double perimeter = (double) sideA+sideB+sideC;
            System.out.println("The perimeter is "+ perimeter);
            Double s = 0.5 * perimeter;
            Double Area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
            System.out.println("The Area of "+ Area);
        }
        else {
            System.out.println(" The sides do not form Triangle");
        }
    }
}
