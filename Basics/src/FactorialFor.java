
public class FactorialFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=6;
		int result=1;
		if ( fact==0||fact==1) {
			System.out.println("Factorial is :"+fact);
		}else
		{
			for (int i=1;i<fact;i++) {
				result=result*i;
			}
		}
System.out.println(result);
	}

}
