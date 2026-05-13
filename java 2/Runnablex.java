import java.util.*;
class fib implements Runnable{
    int n;
    fib(int n){
        this.n=n;
    }

    public void run(){
        int a=0,b=1;
        for(int i=0;i<n;i++){

            System.out.println("fib"+a);
            int c=a+b;

            a=b;
            b=c;
        }
    }
}
class even implements Runnable{
    int str,end;
    even(int s,int e){
        str=s;
        end=e;
    }
    public void run(){
        for(int i=str;i<=end;i++){
            if(i%2==0){
                System.out.println("even"+i);
            }
        }
    }
}
public class Runnablex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit for fibonacci");
        int n = sc.nextInt();
        System.out.println("enter range for even");
        int st = sc.nextInt();
        System.out.println("enter range for even");
        int ed = sc.nextInt();

        fib f=new fib(n);
        even e=new even(st, ed);

        Thread t1 = new Thread(f);
        Thread t2 = new Thread(e);

        t1.start();
        t2.start();

    }
    
}
