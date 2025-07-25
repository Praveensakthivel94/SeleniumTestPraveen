
public class PrimeNumber {

	public static void main(String[] args) {
		// Prime number =16
		int no=16;
		boolean result=true;
		if (no<=1) {
			result=false;
		}
		else {
		for (int n=2;n<=Math.sqrt(no);n++) {
			if (no%n==0) {
				result=false;
			}
		}	
		}
		System.out.println("It is"+result);
	}
}
