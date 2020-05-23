package CorePractise;


    public class NewConstructor {

        public NewConstructor(int i, int k)
        {
            int c = i+k;
            System.out.println("given number is int value"+c);
        }
        public NewConstructor( long l, long j){
            long result = l+j;
            System.out.println("given number is long value"+result);
        }

        public static void main(String[] args) {
         NewConstructor nc =  new NewConstructor(2199886l, 8755667l );
         System.out.println(nc);

        }
}

