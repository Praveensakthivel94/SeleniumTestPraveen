
public class FactorialRecursion {
	
	public static int factorial(int n) {
		if (n==0||n==1) { // basecase
			return 1;
		}else {
		int result=n*factorial(n-1); //recursion 
		return result;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		int result=factorial(number);
		System.out.println(result);
	}

}
