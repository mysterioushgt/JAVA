package Functions;

public class range {
    public static boolean checkprime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeinRange(int n) {
        for(int i =2;i<=n ;i++)
        {
            if(checkprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

    primeinRange(20);
        
    }
}
