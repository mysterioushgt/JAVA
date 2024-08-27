package Functions;

public class prime3 {
    public static void checkPrime(int n){
        int count = 0;
        for(int i=2; i<=Math.sqrt(n);i++)
        {
            if( n % i == 0)
            {
                count = 1;
            }
        }
        if(count == 0){
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime");
        }
    }
    public static void main(String args[]){
        checkPrime(2);
    }
}
