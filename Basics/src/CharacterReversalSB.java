
public class CharacterReversalSB {

	public static void main(String[] args) {
		// String Builder
		String word="Hello world";
		StringBuilder sb=new StringBuilder(word);
		System.out.println(sb.reverse());
		
		for (int i=word.length()-1;i>=0;i--) { //4 
			
			char cv=word.charAt(i);
			System.out.print(cv);
		}
	}

}
