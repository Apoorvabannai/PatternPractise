package SlidenerdPractise;

import java.util.Scanner;

public class DecimalToBinary {
    public String decimalBinary(int number){
    String binary = " ";
    if( number == 0 ) {
        return "0";
    }
    while(number> 0){
        int remainder =  number %2;
        binary = remainder+binary; //  do not use += as output differs
        number = number/2;
        System.out.println("the binary is "+ binary);
    }
    return binary;
}
    public static void main(String[]args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int number = sc.nextInt();
//        DecimalToBinary db = new DecimalToBinary();
//        String binary =   db.decimalBinary(number);
//        System.out.println(" The binary is "+ binary );
//    }
        // method 2 using String buffer it can append(store values)
        StringBuffer buf = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println(" 0");
        }
        while (number > 0) {
            int remainder = number % 2;
            buf.append(remainder);
            number = number / 2;
        }
        buf.reverse();
        System.out.println(buf);
    }
}
