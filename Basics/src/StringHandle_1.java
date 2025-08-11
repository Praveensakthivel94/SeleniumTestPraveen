import java.util.HashMap;

public class StringHandle_1 {

	public static void main(String[] args) {
		// pic the vowel from the word use hashMap
		String word="Development";
		int count=0;
		HashMap<Integer,Character> hashcollect=new HashMap<Integer,Character>();
		for(int i=0;i<word.length();i++) {
			char sorted=word.charAt(i);
			if (sorted < 'a' || sorted > 'z') {
				System.out.println("Value have symbols");
			}
			if (sorted !='a'&& sorted !='e'&& sorted !='i'&& sorted !='o'&& sorted !='u' ) {
				count++;
				hashcollect.put(i, sorted);
			}
		}
		System.out.println("Total consonents: " + count);
	     System.out.println("consonents with positions: " + hashcollect);
	}
}
