import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindingLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr={10,20,45,67,76};
		int largestnumber=IntStream.of(arr).max().orElseThrow();
		System.out.println(largestnumber);
		
		//finding the smallest number 
		int small=IntStream.of(arr).min().orElseThrow();
		System.out.println(small);
	}

}
