import java.util.*;
class tok
{
  public static void main(String ar[])
  {
    String tokenizer ob=new String tokenizer("hai hello welcome","."," ");
    int c=ob.countTokens();
    System.out.println(c);
    System.out.println(ob.nextToken());
  }
}