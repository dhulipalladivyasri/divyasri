import java.util.*;
class equal
{
   public static void main(String ar[])
   {
     String s1;
     System.out.print("enter 1st string:");
     Scanner ob=new Scanner(System.in);
     s1=ob.nextLine();
     System.out.println("entered string is:"+s1);
     String s2; 
     System.out.print("enter 2nd string:");
     Scanner ob1=new Scanner(System.in);
     s2=ob1.nextLine();
     System.out.println("entered string is:"+s2);
     boolean equ=s1.equals(s2);
     System.out.println("equals:"+equ);
   }
}