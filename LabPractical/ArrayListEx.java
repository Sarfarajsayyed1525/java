import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
	List l=new ArrayList();
	l.add(5);
	l.add("ff");
	l.add(15);
	l.add(5);
	l.add(null);

      System.out.println("Element after add:"+" "+l);
   
     l.remove(3);
      System.out.println("Element after remove:"+" "+l);
   
     Iterator it=l.iterator();
     while (it.hasNext())
  {
       System.out.println("Retrieve element:"+" "+it.next());
	}
	}
}