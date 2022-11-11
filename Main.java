import java.util.*;
class Main
{
    public static void main (String[] args) 
    {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the A");
    float A=sc.nextFloat();
    System.out.println("Enter the B");
    float B=sc.nextFloat();
    System.out.println("Addition of A+B= "+(A+B));
    System.out.println("Substrction of A-B= "+(A-B));
    System.out.println("multiplication of A*B= "+(A*B));
    System.out.println("Dividation of A/B= "+(A/B));
    }
}
import java.util.*;
class Main
{
    public static void main (String[] args) 
    {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the Number");
    float C=sc.nextFloat();
    if (C%2==0)
    {
      System.out.println("The Number is even"); 
    }
    else
    {
        System.out.println("The Number is Odd");
    }
}
}