package SlidenerdPractise;

import javax.xml.stream.FactoryConfigurationError;

public class FactorialProgram {
    public void  factorial( int n){
        int  product = 1;
        for( int i = 1; i <=n; i++){
            product *= i;
        }
        System.out.println(product);
    }
    public static void main(String [] args){
        FactorialProgram fP = new FactorialProgram();
        fP.factorial(6);
    }
}
