package SlidenerdPractise;

import java.util.Arrays;

public class HighestNumber{
    public static void main(String []args){
        int[] numbers = {-1, -2, -3, -4, -5, -6, -7, 8, 9, 10};
        highestNumber(numbers);
    }

    public static void highestNumber(int [] arrayInput){
        int highNum = 0;
//        int i = 0;
        System.out.println(Arrays.stream(arrayInput).filter(i -> i < 0).count());
//        for(i; i < arrayInput.length -1; i++){
//            if(arrayInput[i] < 0){  
//
//            }
//        }
//        while( i < arrayInput.length -1){
//            highNum = Arrays.stream(arrayInput).reduce(true,(a,b) -> a > b ? a : b);
//            i++;
//        }
//        System.out.println("Highest number = "+highNum);
    }
}