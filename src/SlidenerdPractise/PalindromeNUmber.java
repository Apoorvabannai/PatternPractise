package SlidenerdPractise;

import java.util.Scanner;

public class PalindromeNUmber {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int number = Integer.parseInt(sc.nextLine());
//        StringBuffer buf = new StringBuffer(number + " ");
//        buf.reverse();
//        String s = buf.toString();
//        int reverse = Integer.parseInt(s);
//        if (number == reverse) {
//            System.out.println("Its a Palindrome!!");
//        } else {
//            System.out.println("Not a Palindrome!!");
//        }
//    }
        PalindromeNUmber p = new PalindromeNUmber();
        p.method2();

    }

    public void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int nu = sc.nextInt();
        int temp = nu;
        int digit;
        while (temp != 0) {
            digit = temp % 10;
            System.out.print(digit);
            temp = temp / 10;
        }
    }
}


