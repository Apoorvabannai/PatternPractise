package SlidenerdPractise;

import java.util.Scanner;

public class RightAngleTriangleSide {

    public static void main (String[] args){
        int hypo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Side");
        int sideA = sc.nextInt();
        System.out.println("Enter the Second Side");
        int sideB = sc.nextInt();
        System.out.println("Enter the Third Side");
        int sideC = sc.nextInt();
        if(sideA > sideB && sideA >sideC){
               hypo = sideA;
             if((hypo * hypo) == (sideB * sideB) + (sideC * sideC)) {
                 System.out.println("Its right angled triangle with hypotenuse "+ hypo);
             }
             else{
                 System.out.println("The given sides cannot be right angle triangle");
             }

        }
        else if(sideB > sideA && sideB > sideC) {
                 hypo = sideB;
                 if ((hypo * hypo) == (sideA * sideA) + (sideC * sideC)) {
                     System.out.println("Its right angled triangle with hypotenuse "+ hypo);
                 }
                 else{
                     System.out.println("The given sides cannot be right angle triangle");
                 }
        }
        else{
                hypo = sideC;
                if((hypo * hypo) == (sideB * sideB) + (sideA * sideA)){
                    System.out.println("Its right angled triangle with hypotenuse "+ hypo);
                }
                else{
                    System.out.println("The given sides cannot be right angle triangle");
                }
        }
    }
}
