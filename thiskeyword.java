/*
class test
{
  int a;
    test()
    {
        this(10);
        System.out.print("hi");
    }
   test(int x)
    {
       a=x;
       System.out.print(a);
    }
}
   class t_p
    {
      public static void main(String ar[])
       {
         test ob=new test();
       }
    }
*/


class test
{
  int a;
    test()
    {
        System.out.print("hi");
    }
   test(int x)
    {
       this();
       a=x;
       System.out.print(a);
    }
}
   class t_p
    {
      public static void main(String ar[])
       {
         test ob=new test(20);
       }
    }