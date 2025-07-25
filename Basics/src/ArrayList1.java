import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("tarun");
	list.add("praveen");
	list.add("a");
	list.remove("a");
	boolean b1=list.contains("a");
	System.out.println(list.get(0));
	System.out.println(b1);
	
	//-----------------------------
	String[] s= {"jango","ata"};
	List<String> s2=Arrays.asList(s); //converting during run time 
	System.out.println("Printing the converted Arrays"+s2);
	String[]converted=s2.toArray(new String[0]); //converting to Array
	System.out.println(s2);
	}
}
