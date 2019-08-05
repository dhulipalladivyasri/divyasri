import java.util.*;
class starts
{
   public static void main(String ar[])
   {
     String s1;
     System.out.print("enter 1st string:");
     Scanner ob=new Scanner(System.in);
     s1=ob.nextLine();
     System.out.println("entered string is:"+s1);
     boolean starts=s1.startsWith("d");
     System.out.println("starts:"+starts);
   }
}