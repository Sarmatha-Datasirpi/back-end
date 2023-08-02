public class Methods {
    static int plusMethod(int x, int y) {            //Method Overloading
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }
    void myMethod(String firstname, int age) {               //Arguments Passing
        System.out.println(firstname + " is " + age);
    }
    int myMethodSinPar(int x) {                              // Arguments with return
        return 5 + x;
    }
    public static int sum(int start, int end) {              //Recursion
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }


    public static void main(String[] args) {

        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        Methods methods=new Methods();
        methods.myMethod("Leo", 5);
        methods.myMethod("Jeo", 8);
        methods.myMethod("Ajo", 31);
        int add=methods.myMethodSinPar(10);
        System.out.println(add);
        int result = sum(5, 10);
        System.out.println(result);
    }
}



