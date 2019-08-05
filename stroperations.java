import java.util.*;
class operations
{
   public static void main(String ar[])
   {
     String a;
     System.out.print("enter 1st string:");
     Scanner ob=new Scanner(System.in);
     a=ob.nextLine();
     System.out.println("entered string is:"+a);
     String b; 
     System.out.print("enter 2nd string:");
     Scanner ob1=new Scanner(System.in);
     b=ob1.nextLine();
     System.out.println("entered string is:"+b);
     int comp=a.compareTo(b);
     System.out.println("compareTo:"+comp);
     String c=a.concat(b);
     System.out.println("concate:"+c);
     boolean d=b.endsWith("a");
     System.out.println("ends:"+d);
     boolean s=a.startsWith("d");
     System.out.println("starts:"+s);
     boolean e=a.equals(b);
     System.out.println("equals:"+e);
     int f=a.indexOf("i");
     System.out.println("indexOf:"+f);
     int g=a.lastIndexOf("i");
     System.out.println("lastindexof:"+g);
     int len=a.length();
     System.out.println("length is:"+len);
     String k=a.replace('s','d');
     System.out.println("replace:"+k);
     System.out.println("reverse string is:");
     for(int i=len-1;i>=0;i--)
     {
       System.out.print(a.charAt(i));
     } 
     System.out.println(" ");
     String sub=a.substring(1,4);
     System.out.println("sub:"+sub);
     
   }
}