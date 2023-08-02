class AccessModifier {
    private String name;       //declarations are visible within the class only
    public int age;           //declarations are visible everywhere
    protected double salary;   //declarations are visible within the package or all subclasses (another packages using extends)

    public AccessModifier(String name, int age, double salary) {    //constructor
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void printDetails() {                 //method
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
class Access {
    public static void main(String[] args) {
        AccessModifier am = new AccessModifier("Dharson", 23, 50000.46);
        am.printDetails();
    }
}
