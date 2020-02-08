package SlidenerdPractise;

public class PerfectSquare {
    public void perfectSquare(int number) {
        double rootValue = Math.sqrt(number);
        // System.out.println(root);
        if (rootValue == Math.ceil(rootValue)) {
            System.out.println(number + " is perfect Square ");
        } else {
            System.out.println(number + " is not perfect Square ");
        }
    }

    public static void main(String[] args) {
        PerfectSquare p = new PerfectSquare();
        p.perfectSquare(9);
        p.loopNumbers(100);
    }

    // for a loop or numbers less than 100
    public void loopNumbers(int number ){
        for( int i = 1; i <= number; i++){
            double root = Math.sqrt(i);
            if(root == Math.ceil(root)){
                System.out.println(i + " is perfect square");
            }
//            else{
//                System.out.println( i + " Not a perfect Square");
//            }

        }

    }
}