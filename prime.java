class prime
{
   public static void main(String ar[])
   {
     int i,num,c;
     for(num=1;num<=100;num++)
     {
       c=0;
       for(i=2;i<=num/2;i++)
       {
          if(num%i==0)
          {
             c++;
             break;
           }
        }
       if(c==0&&num!=0)
         System.out.println(num);
      }
    }
}