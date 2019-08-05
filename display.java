import java.util.*;
class test
{
   int a;
   void read()
   {
      System.out.println("enter no:");
      Scanner ob1=new Scanner(System.in);
      a=ob1.nextInt();
      System.out.println(a);
   }
  void display()
   {
    System.out.println(a);
   }
   public static void main(String ar[])
   {
      test ob=new test();
      ob.read();
      ob.display();
      ob.a=50;
      ob.display();
   }
}
