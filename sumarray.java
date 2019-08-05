class sum
{
  public static void main(String ar[])
  {
    int a[]={1,2,3,4,5};
    int sum=0,i;
    for(i=0;i<a.length;i++)
    {
     System.out.println(a[i]);
    }
    for(i=0;i<a.length;i++)
    {
      sum=sum+a[i];
    }
   System.out.print(sum);
  }
}