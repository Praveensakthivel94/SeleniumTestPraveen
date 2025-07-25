
public class consonentVowelCounting {

	public static void main(String[] args) {
		// Input: "Hello World"
		String input="Hello World";
		int vowel=0;int consonent=0;
		String parsetext=input.toLowerCase().trim();
		for (int i=0;i<parsetext.length();i++) {
			char f=parsetext.charAt(i);
			if (f>'a'&&f<'z') {
				if (f=='a'|| f=='e' || f=='i' || f=='o' || f=='u') {
				vowel++;	
				}else{
				consonent++;	
				}	
			}
		}
		System.out.println("Total no is vowel "+vowel);
		System.out.println("Total no is consonent "+consonent);
	}

}
