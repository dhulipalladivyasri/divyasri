import java.util.*;
class index
{
   public static void main(String ar[])
   {
     String s1;
     System.out.print("enter 1st string:");
     Scanner ob=new Scanner(System.in);
     s1=ob.nextLine();
     System.out.println("entered string is:"+s1);
     int index=s1.indexOf("v");
     System.out.println("indexOf:"+index);
   }
}