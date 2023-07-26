public class Operators {
    public static void main(String[] args) {
        int sum1 = 100 + 50;            //Arithmetic operator
        int sum2 = sum1 * 20;
        int sum3= sum2 - sum1;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);


        int x=10;                       //Unary operator
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);


        int a=2;                        // Ternary operator
        int b=5;
        int min=(a<b)?a:b;
        System.out.println(min);

        System.out.println(sum1==sum2);  //relational operator
        System.out.println(sum1!=sum2);
        System.out.println(sum1<=sum2);



        System.out.println(sum1 > 3 && sum2 < 10);  //logical operator
        System.out.println(sum1 > 3 || sum2 < 10);
        System.out.println(!(sum1 > 3 && sum2 < 10));


        System.out.println(a&b);        //bitwise operator
        System.out.println(a|b);
        System.out.println(a^b);

        System.out.println(a<<2);       //shift operator
        System.out.println(a>>2);
    }
}
