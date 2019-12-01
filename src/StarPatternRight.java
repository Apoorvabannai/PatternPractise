import java.util.Scanner;


class PatternOne {
    Scanner sc = new Scanner(System.in);

    public void Starpattern(){
        System.out.println("Enter number of rows and colums");
        int row = sc.nextInt();
        for( int i=1; i<=row; i++){
            for( int j=1; j<= i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

    }
    public static void main(String[]args){
        PatternOne one = new PatternOne();
        one.Starpattern();
    }
}
