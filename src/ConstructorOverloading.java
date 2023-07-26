public class ConstructorOverloading {

    {
        System.out.println("This program is Constructor overloading");
    }

    ConstructorOverloading(double i) {
        this(10);
        System.out.println("girl.");
    }

    ConstructorOverloading(int a) {
        this();
        System.out.println("a good");

    }

    ConstructorOverloading() {
        System.out.println("I am");
    }

    public static void main(String[] args) {

        ConstructorOverloading obj = new ConstructorOverloading(2.6);
    }
}