import java.util.*;
class test
{
   public static void main(String ar[])
   {
     int len;
     String s1;
     System.out.print("enter string:");
     Scanner ob1=new Scanner(System.in);
     s1=ob1.nextLine();
     System.out.println("entered string is:"+s1);
     len=s1.length();
     System.out.print("length is:"+len);
   }
}