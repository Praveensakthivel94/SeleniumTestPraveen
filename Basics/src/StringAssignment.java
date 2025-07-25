
public class StringAssignment {

	public static void main(String[] args) {
	
		String name="I need a switch";
		String[] splittedString=name.trim().split("need"); //Need is the delimiter 
		
		for(String Pr:splittedString)
		{
			System.out.print(Pr);
		}
	}

}
