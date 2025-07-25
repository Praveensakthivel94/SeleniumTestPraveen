public class PalindromeCheckefor{
	public static void main (String[] args) { 
		String str="madam";
		boolean result=true;
		for (int i=0; i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) { //m!=m
				result=false;
			}
				else{
					result=true;	
				}
			}
		System.out.println("Palindrome is :"+result);
	}
}