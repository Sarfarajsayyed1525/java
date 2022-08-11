import java.util.HashSet;

public class DuplicateRemove {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		int[] arr= {9,5,2,6,8,9,3,5,1,2,5,3};
		
		for(int i=0;i<arr.length;i++)
		{
          hs.add(arr[i]);
		}
		for(int no:hs)
        System.out.print(no+" ");
	}
  
}

