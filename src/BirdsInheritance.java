class BirdsInheritance {
    protected String Color = "Green & Blackish";
    public void sound() {
        System.out.println("Coo, Cook!");
    }
}

class Dove extends BirdsInheritance {
    private String speciesName= "Emerald Dove";
    public static void main(String[] args) {
        Dove dove = new Dove();
        System.out.println(dove.speciesName + "-" +dove.Color);
        dove.sound();
    }
}
