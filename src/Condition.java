import java.util.Scanner;

public class Condition {
    public static void main(String args[]){
        //if else
        int age=2;
         if(age>=18){
             System.out.print("Permitted for voting");
         }
         else{
             System.out.println("Not Permitted for voting");
         }
        Scanner sc = new Scanner(System.in);
         //if elseif
         int digit;
        System.out.print("Enter any digit:");
        digit=sc.nextInt();
        if(digit>0){
            System.out.println("Even Number");
        } else if (digit<0) {
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Is Zero");
        }
        //if-else-if ladder and Nested if
        float marks;
        System.out.println("Enter the Marks:");
        marks=sc.nextFloat();
        if(marks>=40){
            System.out.println("Result: Pass");
            if(marks>=90){
                System.out.println("Grade:A");
            } else if (marks>=80 && marks<90) {
                System.out.println("Grade:B");
            } else if (marks>=60 && marks<80) {
                System.out.println("Grade:C");
            }else if (marks>=40 && marks<60) {
                System.out.println("Grade:D");
            }
        }
        else{
            System.out.println("Result: Fail");
        }
        //Switch case
        String days;
        System.out.println("Enter the Day:");
        days=sc.next().toLowerCase();
        switch(days){
            case "sunday":
                System.out.println("First Day");
                break;
            case "monday":
                System.out.println("Second Day");
                break;
            case "tuesday":
                System.out.println("Third Day");
                break;
            case "wednesday":
                System.out.println("Fourth Day");
                break;
            case "thursday":
                System.out.println("Fifth Day");
                break;
            case "friday":
                System.out.println("Sixth Day");
                break;
            case "saturday":
                System.out.println("Weekend Day");
                break;
            default:
                System.out.println("Enter the Valid Day");
        }
        // Looping statement

        //while loop
        int n=0;
        while(n<=10)
        {
            System.out.println(n);
            n=n+2;
        }
        // do-while Loop
        int a=1;
        do
        {
            System.out.println(a);
            a=+2;
        }while(a<=0);
        // for loop
        for(int i=1;i<=10;i=i+2)
        {
            System.out.println(i);
        }
        // for loop reverse
        int b[]={1,2,3,4,5};
        for(int i=b.length-1;i>=0;i--)
        {
            System.out.println(b[i]);
        }
        // for each loop
        for(int c:b)
        {
            System.out.println(c);
        }
        //Nested Loop --Continue -- Break
        for(int i=0;i<6;i++)
        {
            if(i==2)
            {
                continue;
            }
            if(i==4)
            {
                break;
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Label
        a:
        for(int i=0;i<6;i++)
        {
            b:
            for(int j=0;j<=i;j++)
            {
                if(j==4)
                {
                    break b;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




