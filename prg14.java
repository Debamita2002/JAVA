//WAP to find that reads a set of integers and then print the sum of the even and odd integer?
import java.util.*;
class prg14
{
    public static void main (String args[])
 {
    Scanner in = new Scanner(System.in); // use to scan the desired input
    
    int d, s=0,p=0;
    System.out.println("Enter the size of the integers");

    d= in.nextInt(); // used to enter the integers

    for(int i=1;i<=d;i++) // starting point; condition ; upgradation
    {
       if(i%2==0) // even
       {
        s=s+i; // sum of even   

        // s=s+i;   
        // if i=3, s=0;
      //   s=s+i;
      // s= s+

        

       }

       
       else
       {
        p=p+i; // sum of odd
       }
       

    }
       System.out.println("sum of the even numbers " + s);
       System.out.println("sum of the odd numbers " + p);

    

 }   
}
