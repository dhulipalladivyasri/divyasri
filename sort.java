class sorting
{
   public static void main(String ar[])
   {
     int a[]={5,3,2,4,1};
     int i,j,temp;
     for(i=0;i<a.length;i++)
     { 
       for(j=0;j<a.length;j++)
       {
         if(a[i]>a[j])
         {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
          }
       }
     }
   for(i=0;i<a.length;i++)
      System.out.println(a[i]);
   }n
}