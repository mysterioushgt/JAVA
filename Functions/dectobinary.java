package Functions;

public class dectobinary {
    public static void dectobin(int n){
        int mynum = n;
        int pow = 0;
        int binnum =0;
        while (n>0) {
            int rem =n%2;
            binnum = binnum + (int)(rem* Math.pow(10, pow));
            pow  =pow+1;
            n=n/2;

        }
        System.out.println("binary form " + mynum + "=" +binnum);
    }
    public static void main(String[] args) {
        dectobin(21);
    }
}
