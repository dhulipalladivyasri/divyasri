import java.util.*;
class sub
{
   public static void main(String ar[])
   {
     String s1;
     System.out.print("enter 1st string:");
     Scanner ob=new Scanner(System.in);
     s1=ob.nextLine();
     System.out.println("entered string is:"+s1);
     String sub=s1.substring(1,4);
     System.out.println("sub:"+sub);
    }
}