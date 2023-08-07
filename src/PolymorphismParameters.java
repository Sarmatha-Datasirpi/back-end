class Multiplication {
    int mul(int a, int b) {
        System.out.println("Multiply integers...");
        return a * b;
    }

    double mul(double a, double b) {
        System.out.println("Multiply doubles...");
        return a * b;
    }
}

public class PolymorphismParameters {
    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();

        int resultInt = multiplication.mul(53, 3);
        System.out.println("Result of integer addition: " + resultInt);

        double resultDouble = multiplication.mul(2.5, 4.705);
        System.out.println("Result of double addition: " + resultDouble);
    }
}

