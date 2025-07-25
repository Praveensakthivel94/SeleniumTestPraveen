import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String[] arr = {"Ram", "Tharun", "SK", "Annamalai"};

		        List<String> name = Arrays.asList(arr);

		        // Comparator to compare strings by their length (dummy logic building) 
		        Comparator<String> comp = (name1, name2) -> Integer.compare(name1.length(), name2.length());
            
		        // Sort the list based on the comparator
		        name.sort(comp);

		        // Convert the list back to an array if needed
		        arr = name.toArray(new String[0]);

		        // Print the sorted array
		        System.out.println(Arrays.toString(arr));
		    }
	}
