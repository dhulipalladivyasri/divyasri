import java.util.*;
class lastindex
{
   public static void main(String ar[])
   {
     String s1;
     System.out.print("enter 1st string:");
     Scanner ob=new Scanner(System.in);
     s1=ob.nextLine();
     System.out.println("entered string is:"+s1);
     int lastindex=s1.lastIndexOf("r");
     System.out.println("lastindexof:"+lastindex);
   }
}