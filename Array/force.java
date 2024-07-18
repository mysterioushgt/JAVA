package Array;

public class force {
    public static void calculateWork(int totalwork ,int f1,int d1,int f2,int d2){
        int w1 = f1*d1;
        int w2 = f2*d2;
        int net_work = totalwork - w1 - w2; 
        // return net_work;
        System.out.println("net work is : "+net_work);
    }
    public static void main(String[] args) {
        calculateWork(50, 2,3, 4, 5);
    }
}