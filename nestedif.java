
class greater
{
   public static void main(String ar[])
   {
     int a=10,b=15,c=5,max;
     if(a>b)
     {
       if(a>c)
         max=a;
       else
         max=c;
     }
     else
     {
       if(b>c)
         max=b;
       else
         max=c;
     }
     System.out.print(max);
   }
}  
