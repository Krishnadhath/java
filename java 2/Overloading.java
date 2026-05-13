import java.util.*;
public class Overloading {
    void area(double r){
        System.out.println("Area of Circle:"+(Math.PI*r*r));
    }
    void area(double l,double b){
        System.out.println("Area of Rectangle:"+(l*b));
    }
    void area(float s){
        System.out.println("Area of Square:"+(s*s));
    }
    void area(float b,float h){
        System.out.println("Area of Triangle:"+(0.5*b*h));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Overloading a = new Overloading();

        System.out.println("Enter radius of circle:");
        double r=sc.nextDouble();
        a.area(r);

        System.out.println("Enter length n breadth of Rectangle:");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        a.area(l,b);

        System.out.println("Enter side of circle:");
        float s=sc.nextFloat();
        a.area(s);

        System.out.println("Enter length n breadth of Rectangle:");
        float ba=sc.nextFloat();
        float h=sc.nextFloat();
        a.area(ba,h);
    }

    
}
