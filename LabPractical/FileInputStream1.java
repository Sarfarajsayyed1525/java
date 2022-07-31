import java.io.*;
class FileInputStream1
 {
   public static void main(String[] args)
    {
       try
      {
         FileInputStream f =new FileInputStream ("C:\\Users\\SARFARAJ SAYYED\\Desktop\\Mainfile.txt");
         int i=0;
         f.skip(5);
         while((i=f.read())!=-1)
        {
           System.out.print((char)i);
    
        }
         f.close();
      }
         catch(IOException e)
       { 
         System.out.println(e);
       }
   }
 }