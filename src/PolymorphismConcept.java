class Gadgets {
    public void price() {
        System.out.println("Overall Price variation about the products.");
    }
}

class HeadPhones extends Gadgets {
    public void price() {
        System.out.println("The price of headphones:Rs.799");
    }
}

class AirPods extends Gadgets {
    public void price() {
        System.out.println("The price of airpods:Rs.26,900");
    }
}

class PolymorphismConcept {
    public static void main(String[] args) {
        Gadgets gadgets = new Gadgets();
        Gadgets gadProduct1 = new HeadPhones();
        Gadgets gadProduct2 = new AirPods();
        gadgets.price();
        gadProduct1.price();
        gadProduct2.price();
    }
}