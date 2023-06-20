import java.util.*;
class calculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        double d,a,b;
        System.out.println("Enter 1 for sum or enter 2 for subtraction or enter 3 for division or enter 4 for multiplication of two numbers");
        choice=sc.nextInt();
        System.out.println("Enter the value of first no.");
        a=sc.nextDouble();
        System.out.println("Enter the value of second no.");
        b=sc.nextDouble();
        switch(choice)
        {
            case 1: System.out.println("Sum is "+(a+b));
                    break;
            case 2: if(a>b)
                    {
                        System.out.println("difference is "+(a-b));
                        break;
                    }
                    else
                    {
                        System.out.println("difference is "+(b-a));
                        break;
                    }
            case 3: d=a/b;
                    System.out.println("Quotient is "+d);
                    break;
            case 4: System.out.println("Product is "+(a*b));
                    break;
            default: System.out.println("Enter the right choice");
                     break;
        }
    }
}