import java.util.HashSet;
import java.util.Scanner;
class Main{
  public static void main(String[]args)
  {
    //int a[]=new a[15];
    int[] a = new int[20];
    int i;
    System.out.println("enter the range of array");
    Scanner s= new Scanner(System.in);
    int length=s.nextInt();
    System.out.println("enter the elements in an array");
    for(i=0;i<length;i++)
      {
        a[i]=s.nextInt();
      }
HashSet<Integer> hs = new HashSet<Integer>();
    for(i=0;i<length;i++)
      {
        hs.add(a[i]);
      }

    for(int no:hs)
      {
        System.out.print(no+"");
      }
    

  }
}
