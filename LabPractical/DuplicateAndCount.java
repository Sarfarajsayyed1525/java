import java.util.HashSet;
import java.util.Set;

public class DuplicateAndCount {

	public static void main(String[] args) {
		
	int arr[]= {3,7,5,5,9,2,9,3,7};
	Set<Integer> s=new HashSet<>();
	for(int no:arr)
	{
			if(s.add(no)==false)
			{
				System.out.println(no);
			}
		
		}
		
	}
	}


