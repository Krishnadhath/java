import java.util.*;
class Mul extends Thread{
    public void run(){
        System.out.println("Multiplication Table of 5:");
        for(int i=1;i<=10;i++){
            System.out.println("5 x "+(i)+"="+(5*i) );
        }
    }
}
class Pri extends Thread{
    int n;
    Pri(int n){
       this.n=n; 
    }
    public void run(){
        System.out.println("\nFirst " + n + " Prime Numbers:");

        int count=0,num=2;
        
        while(count<n){
            boolean isPrime=true;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }}
                if(isPrime){
                    System.out.println(num+" ");
                    count++;
                }
                num++;
            }
    }
}

public class Threadx {
    public static void main(String[] args) {
        Mul m = new Mul();
        Pri p = new Pri(5);

        m.start();
        p.start();
    }
    
}
