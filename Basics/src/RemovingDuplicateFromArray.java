import java.util.Arrays;
import java.util.List;

public class RemovingDuplicateFromArray {

	public static void main(String[] args) {
		Integer[] arr = { 10, 15, 33, 33, 44};
		List<Integer> li = Arrays.asList(arr);
		li.stream().distinct().forEach(s -> System.out.print(" "+s));
		
		Integer[] sorted=li.toArray(new Integer[0]);
	}
}
