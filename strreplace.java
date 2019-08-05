import java.util.*;
class replace
{
   public static void main(String ar[])
   {
     String s1;
     System.out.print("enter 1st string:");
     Scanner ob=new Scanner(System.in);
     s1=ob.nextLine();
     System.out.println("entered string is:"+s1);
     char c1;
     System.out.print("enter 1st character:");
     Scanner ob1=new Scanner(System.in);
     c1=ob1.next().charAt(0);
     System.out.println("entered character is:"+c1);
     char c2;
     System.out.print("enter 2nd character:");
     Scanner ob2=new Scanner(System.in);
     c2=ob2.next().charAt(0);
     System.out.println("entered character is:"+c2);
     String replace=s1.replace(c1,c2);
     System.out.println("replace:"+replace);
   }
}