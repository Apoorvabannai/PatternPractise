package SlidenerdPractise;

public class fibinocci {
    static int fibnocciSeries(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibnocciSeries(n-1)+ fibnocciSeries(n-2);
        }
    }
        public static void main(String[]args){

           System.out.println(fibnocciSeries(6) );
        }

}

