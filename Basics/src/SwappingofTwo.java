
public class SwappingofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;int b=20;
		int x=10;int y=20;
		System.out.println("before Swapping :"+a+"and"+b);
		int c=a+b; //30
		a=c-a; //20
		b=c-b; //10
		System.out.println("Arithmetic before Swapping :"+a+"and"+b);
		System.out.println("before Swapping :"+x+"and"+y);
		int z=x^y;  //XOR
		x=z^x;
		y=z^y;
		System.out.println("XOR before Swapping :"+x+"and"+y);
	}

}
