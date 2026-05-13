import java.util.*;
interface shape{
   void area();
   void perimeter();
}
class Rectangle implements shape{
    int length;
    int breadth;

    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    public void area(){
        System.out.println("Area of the Rectangle="+(length*breadth));
    }
    public void perimeter(){
        System.out.println("Perimeter of the Rectangle="+(2*(length+breadth)));
    }
}
class Circle implements shape{
    double radius;
    Circle(double r){
        radius=r;
    }
    public void area(){
        System.out.println("Area of the Circle="+(Math.PI*radius*radius));
    }
    public void perimeter(){
        System.out.println("Perimeter of the Circle="+(2*Math.PI*radius));
    }
}
public class Interface {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("1. Circle");
    System.out.println("2. Rectangle");

    System.out.println("Enter your choice:");
    int choice=sc.nextInt();

    switch(choice){
        case 1:
            System.out.println("Enter radius:");
            double r = sc.nextDouble();

            Circle c = new Circle(r);
            c.area();
            c.perimeter();

            break;
        case 2:
             System.out.println("Enter length:");
            int l = sc.nextInt();

            System.out.println("Enter breadth:");
            int b = sc.nextInt();

            Rectangle s = new Rectangle(l, b);
            s.area();
            s.perimeter();

            break;
        default:
            System.out.println("Invalid Choice");

    }
    
 }

}
