//find sum of n natural numbers

import java .util.*;
class prg13

{
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);

        int n;
        int s=0;
        System.out.println("Enter the value of n");
        n =in.nextInt();


        for(int i=1;i<=n;i++) 
        {
            s=s+i; 
        }
        System.out.println(s);
    }
}