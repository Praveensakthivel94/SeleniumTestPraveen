import java.util.HashMap;
public class CharOccurrence {
 public static void main(String[] args) {
 String str = "programming";
 
HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
 
 for (char ch : str.toCharArray()) {
	 
 if (charCount.containsKey(ch)) {
 charCount.put(ch, charCount.get(ch) + 1);  //<character and Integer>
 } else {
 charCount.put(ch, 1);
 }
 }
 
 System.out.println(charCount);

 
 }
}
