import java.io.*;
import java.util.Scanner;

interface Demo{
    double Pi=3.14;
    void area(double r);
}
class CircleArea implements Demo{
    @Override
    public void area(double r) {
        System.out.println("Area of Circle:"+Pi*(r*r));
    }
}
class CalculationCircle{
    public static void main(String[] args) {
        double i;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Area Calculation Using Interface");
        System.out.print("Enter the Radius Value:");
        i=scanner.nextDouble();
//        CircleArea obj = new CircleArea();
//        obj.area(i);
        Demo m =new CircleArea();
        m.area(i);
    }
}