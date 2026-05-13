import java.util.Scanner;

class Myexception extends Exception{
    Myexception(String msg){
        super(msg);
    }
}
public class Negex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter no of nos:");
        int n=sc.nextInt();

        double sum=0;

        for(int i=0;i<n;i++){
            System.out.println("Enter number "+(i+1));
            int num = sc.nextInt();

            try{
                if(num<0){
                    throw new Myexception("no negative nos");
                }
                sum+=num;
            }
            catch(Myexception e){
                System.out.println(e.getMessage());
            }

        }

        double avg=sum/n;
        System.out.println("Average:"+(avg));

    }
    
}
