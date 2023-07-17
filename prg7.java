// to find the largest of two numbers

import java.util.*;
class prg7
{
public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
    System.out.println("Enter two numbers");
   int a=in.nextInt();
    int b=in.nextInt();
    
    if (a>b)
    {
        System.out.println(a);
    }

    else if(a==b)
    {
        System.out.println("Numbers are equal");
    }
    else
    {
        System.out.println(b);
        

    }
        
}






}