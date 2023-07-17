import java.util.*;
class prg4
{
    public static void main(String args[])
    {
        Scanner in=new Scanner (System.in);
        int a,b,c;
       System.out.println("Enter three numbers");
        a= in.nextInt();
        b =in.nextInt();
        c=in.nextInt();
        double d= (a+b+c)/3;
        System.out.println(d);

    }
}