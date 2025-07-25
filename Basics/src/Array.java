
public class Array {

	public static void main(String[] args) {
		
		int[] arr= new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		//System.out.println("printing the declared value"+arr[0]);
		
		int[] ar= {3,4,5,6};
		
		for(int s:ar)
		{
		System.out.println("printing all array values"+s);
		}
		for (int i=ar.length-1;i>=0;i--) //int i=3,3>=0
		{
		System.out.print(ar[i]);
	    }

	}

}
