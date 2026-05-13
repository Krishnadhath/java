import java.util.Scanner;

class Product{
    int pcode;
    String name;
    double price;


Product(int c,String n,double p){
    pcode = c;
    name = n;
    price = p;    
}

void display(){
    System.out.println("Product Code:"+ pcode);
    System.out.println("Product Name:"+ name);
    System.out.println("Product Price:"+ price);    
}
}
public class Productp {


public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter product 1 details");
        int c1 = sc.nextInt();
        sc.nextLine(); 
        String n1 = sc.nextLine();
        double p1 = sc.nextDouble();

        // Input for Product 2
        System.out.println("Enter Product 2 Details:");
        int c2 = sc.nextInt();
        sc.nextLine();
        String n2 = sc.nextLine();
        double p2 = sc.nextDouble();

        // Input for Product 3
        System.out.println("Enter Product 3 Details:");
        int c3 = sc.nextInt();
        sc.nextLine();
        String n3 = sc.nextLine();
        double p3 = sc.nextDouble();

    Product ob1 = new Product(c1,n1,p1);
    Product ob2 = new Product(c2,n2,p2);
    Product ob3 = new Product(c3,n3,p3);

    Product low = ob1 ;
    if (ob2.price<low.price){
        low=ob2;
    }
    if (ob3.price<low.price){
        low=ob3;
    }

    System.out.println("\nProduct with Lowest Price:");
        low.display();
}


}






