import java.io.*;
class table_while
{
 public static void main(String args[])throws IOException

 {
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  System.out.println("TABLE PROGRAM");
  System.out.println("ENTER THE TABLE NUMBER:");
  String s1=br.readLine();
  int n=Integer.parseInt(s1);
  System.out.println(n+"th TABLE");
  int i=1;
  while(i<=10)
  {
   System.out.println(i+"x"+n+"="+(i*n));
   i++;
  }
 }
}