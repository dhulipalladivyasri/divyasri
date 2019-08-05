import java.util.*;
class ends
{
   public static void main(String ar[])
   {
     String s1;
     System.out.print("enter 1st string:");
     Scanner ob=new Scanner(System.in);
     s1=ob.nextLine();
     System.out.println("entered string is:"+s1);
     boolean ends=s1.endsWith("a");
     System.out.println("ends:"+ends);
   }
}