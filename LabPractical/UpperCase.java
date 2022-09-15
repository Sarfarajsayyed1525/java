
import java.io.*;
class UpperCase
{
public static void main(String args[]) throws Exception
{
   ByteArrayOutputStream f = new ByteArrayOutputStream();
     System.out.println ("Enter characters");
       f.write(System.in.read( ) );
         byte b[] = f.toByteArray();
            ByteArrayInputStream p = new ByteArrayInputStream(b);       
            System.out.println("converted uppercase characters");     
             int r=p.read();
           System.out.print(Character.toUpperCase((char)r));
          
     }
  }    
          







