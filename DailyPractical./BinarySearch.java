import java.util.*;
class BinarySearch
 {
   public static void main(String args[])
 {
      int[] arr={5,10,15,20,25,30,35,40,45,50};
      int key=35;
      int first=0;
      int last=arr.length-1;
      int mid=(first+last)/2;
       while(first<=last)
      {
          if(arr[mid]==key)
        { 
            System.out.println("Element found at index"+" "+mid);
              break;
      }
        else if(arr[mid]<key)
      {   
             first=mid+1;
        }
          else
         {
              last=mid-1;
            }
               mid=(first+last)/2;
           }
               if(first>last)
            {
                System.out.println("Elements not found");
       }
     }
  }
         