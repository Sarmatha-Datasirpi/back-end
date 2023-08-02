class Test {
        //Static variables
        private static int i= 0;
        static String j= " ";

        //Static blocks
        static{System.out.println("First Printed");}
        static
        {
            System.out.println("Static Block Called ");
            j="Shara";
            System.out.println(i);
        }

        // Constructors called
        Test() {
            System.out.println("Constructor called");
        }
        Test(int num){
            this.i=num;
            System.out.println("Print i value:"+i);
        }
}
// Main class
class staticBlocks {
    public static void main(String args[])
    {
        Test t1 = new Test();
        System.out.println(Test.j);
        Test t2 = new Test(20);
    }
}

