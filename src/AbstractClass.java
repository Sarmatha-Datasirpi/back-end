abstract class Windows{

    abstract void close();
    abstract void run();
    void boot(){
        System.out.println("Opened");
    }
}

class Microsoft extends Windows{
    void run(){System.out.println("Progress..");}
    void close(){System.out.println("Both Closed");}
}

class AbstractClass{
    public static void main(String args[]){
        Windows windows = new Microsoft();
        windows.boot();
        windows.run();
        windows.close();
    }
}