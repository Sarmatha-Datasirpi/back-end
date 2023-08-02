class Program {
        private String name;
        // getter method
        public String getName() {
            return this.name;
        }
        // setter method
        public void setName(String name) {
            this.name= name;
        }
    }
    public class Encapsulation {
        public static void main(String[] main){
            Program program = new Program();

            // access the private variable using the getter and setter
            program.setName("DataSirpi Company");
            System.out.println(program.getName());
        }
    }

