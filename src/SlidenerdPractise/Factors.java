package SlidenerdPractise;

public class Factors {
    public void factorsCalculations( double  number){
         int count = 0;
        for( int i = 1; i <= number; i++ ){
             Double result = number/ i;
           //  System.out.println(result +" \t"+ Math.ceil(result));
             if(result == Math.ceil(result)){
                System.out.println(i + " : is factor  of "+ number);
                 count ++;
             }
        }
        System.out.println(" The Number of Factors of "+ number + " are : "+ count);

    }
    public static void main(String[]args){
        Factors fs = new Factors();
        fs.factorsCalculations(8);
    }
}
