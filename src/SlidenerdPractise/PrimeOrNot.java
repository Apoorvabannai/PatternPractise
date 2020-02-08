package SlidenerdPractise;
// this is for a particular number if you want to find all prime less than 100 or some value reset the numOffactors to 0
public class PrimeOrNot {
    int numOfFactors = 0;
    public void IsPrime( double number ){
        for( int i = 1; i <= number;i++ ) {
            double result = number / i;
          //  System.out.println(result);
            if (result == Math.ceil(result)) {
                numOfFactors++;
            }
        }
        if (numOfFactors == 2) {
            System.out.println("Number is a prime number ");
        } else {
            System.out.println(" Number is not a prime number");
        }

    }
    public static void main(String[]args){
        PrimeOrNot p = new PrimeOrNot();
        p.IsPrime( (double)7);
    }
}
//  from 1- 100: j = 2 as 1 is neither prime nor composite.
   /*  for(int i = 2; j< = 100; j++){
         for( int i = 1; i <= j; i ++)
         {
         double result = j/i     (double number as j )
         if(result == Math.ceil(result){
         numOfFactors++;
         }
          if (numOfFactors == 2) {
            System.out.println("Number is a prime number ");
        } else {
            System.out.println(" Number is not a prime number");
        }
        numOfFactors =0;
        }
    */
// Method 2:



