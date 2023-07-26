class InstanceVariable {
    String firstname = "Sharmatha";     //Instance Variables
    String lastname = "Kuberamani";
    int age = 22;
}
public class MyClass {
    // Instance variables
    int myInt;
    String myString;
    public static void main(String[] args) {
        InstanceVariable myObj = new InstanceVariable();
        System.out.println("Name: " + myObj.firstname + " " + myObj.lastname);
        System.out.println("Age: " + myObj.age);
        MyClass myObj1 = new MyClass();
        myObj1.myInt = 42;
        myObj1.myString = "Have a";
        MyClass myObj2 = new MyClass();
        myObj2.myInt = 100;
        myObj2.myString = "Good Day";
        System.out.println(" " + myObj1.myString + " " + myObj2.myString);
    }
}



