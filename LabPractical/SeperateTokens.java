 import java.util.StringTokenizer;

 public class SeperateTokens
{
   public static void main(String args[])
{
     String st=" My Name Is Sayyed Sarfaraj ";
     StringTokenizer s =new StringTokenizer(st);
     while (s.hasMoreTokens())
      {
          System.out.println(s.nextToken());
      }
             System.out.println("String length is: " + st.length());

             System.out.println("Upper case is: " + st.toUpperCase());

             System.out.println("Index no. at character 'N' is: " + st.indexOf('N'));

             System.out.println("Character at index no. 5 is: " + st.charAt(5));

             System.out.println("String contains 'Name' or not: " + st.contains("Name"));
 }

 }