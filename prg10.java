// make an arithemetic calculator using switch case

import java.util.*;


class prg10

{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the operator");
        char c;
        
        c=in.next().charAt(0);  //c= '+','-'

        System.out.println("Enter two numbers");
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        


        switch(c)
        {
            case '+':
            System.out.println(a+b);
            break;

            case '-':
            System.out.println(b-a);
            break;

            case '*':
            System.out.println(a*b);
            break;

            case '/':
            System.out.println(a/b);
            break;

            default:
            System.out.println("invalid");
            

            

            


        }
    }
}