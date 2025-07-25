
public class FindingSmallestofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8, 2, 15, -4, 5};
		int small=arr[0]; //8 
		for (int i=0;i<arr.length;i++) {
			if (arr[i]<=small) {
				small=arr[i];
			}
		}
System.out.println("printing the largest number:"+small);
	}
}
