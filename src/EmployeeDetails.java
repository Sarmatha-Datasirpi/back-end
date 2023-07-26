class EmployeeDetails {

    // static variable
    static int age= 21;
    //static method
    public static void employeeName(){
        int b = 10;
        System.out.println("Employee Name: Sarmatha K");

    }
    public void employeeId(){
        System.out.println("Employee Id: 27");
    }
}
class Clients extends EmployeeDetails { // Extending EmployeeDetails class in clients class
    public void clientName(){
        System.out.println("Client Name: Joe");
    }
    //static method
    public static void clientId(){
        System.out.println("Client Id is: 65");
        System.out.println("Client age:" + age);
    }

    public static void main(String[] args) {
        employeeName();
        Clients c = new Clients();
        c.employeeId();
        c.clientName();
        clientId();

    }
}