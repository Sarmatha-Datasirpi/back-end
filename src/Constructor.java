public class Constructor {
    int a;
    String b;
    Constructor(){
        System.out.println("Passing No Arguments");
        System.out.println();
    }
    Constructor(int value, String name){
        System.out.println("Passing Arguments in Constructor");
        a=value;
        b=name;
        System.out.println(a+" "+b);
    }
    void details(){
        System.out.println("Entered Details");
        System.out.println(a);
        System.out.println(b);
        System.out.println();
    }
    static int addition(int a, int b){
        System.out.println("Add");
        return a+b;
    }
    public static void main(String[] args) {
        Constructor obj= new Constructor();
        obj.a=10;
        obj.b="Shara";
        Constructor obj1= new Constructor(23,"Dharson");
//calling non-static method
        obj.details();
//calling static method
        System.out.println(addition(243,1124));
    }
}

