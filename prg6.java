import java.util.*;
class prg6
{
    public static void main(String args[])
    {
        Scanner in=new Scanner (System.in);
        float a,b,c;
       System.out.println("Enter the cost of pencil");
        a= in.nextFloat();
       System.out.println("Enter the cost of pen");
        b =in.nextFloat(); 
        System.out.println("Enter the cost of eraser");
        c=in.nextFloat();
        float amount;
        amount=a+b+c;
        float bill=(18*amount/100)+amount;

System.out.println(bill); 

    
}
}
