
class HumanBody {
    String hairColor = "White";
    int age=82;
}

class Head extends HumanBody {
    String hairColor = "Black";
    int  age=14;
    void ageDiffer() {
        System.out.println(hairColor);
        System.out.println(age);
        System.out.println(super.hairColor);
        System.out.println(super.age);
    }
}

public class PartsSuper {
    public static void main(String[] args) {
        Head head= new Head();
        head.ageDiffer();
    }
}

