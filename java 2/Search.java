import java.util.*;
public class Search {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Elements");
        int n=sc.nextInt();

        int arr[]= new int[n];

        System.out.println("Enter digits");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter element to search");
        int key = sc.nextInt();

        boolean found=false;

        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("Element found at position "+ (i+1));
                found=true;
                break;
            }
        }

        if (!found){
            System.out.println("Elmennt not found");
        }


    }

    
}
