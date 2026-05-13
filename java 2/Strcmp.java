import java.util.*;
public class Strcmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter no of Strings");
        int n = sc.nextInt();

        sc.nextLine();
        
        String str[]=new String[n];

        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(str[i].compareTo(str[j])>0){
                    String temp = str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        System.out.println("\nSorted Strings:");

        for(int i=0;i<n;i++){
            System.out.println(str[i]);
        }
    
    }
    
}
