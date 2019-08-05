import java.util.*;
class reverse
{
   public static void main(String ar[])
   {
     int i;
     String s1;
     System.out.print("enter 1st string:");
     Scanner ob=new Scanner(System.in);
     s1=ob.nextLine();
     System.out.println("entered string is:"+s1);
     int len=s1.length();
     for(i=len-1;i>=0;i--)
     {
       System.out.print(s1.charAt(i));
     } 
   }
}