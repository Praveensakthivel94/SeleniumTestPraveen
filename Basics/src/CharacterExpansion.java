public class CharacterExpansion {
    public static void main(String[] args) {
        String input = "a2b3c4f0";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i = i+2) { //skips 2 digits 
            char ch = input.charAt(i);       // letter -a
            int count = input.charAt(i + 1) - '0';  // convert char digit to int(index+1) 

            for (int j = 0; j < count; j++) {
                result.append(ch);           // repeat letter
            }
        }

        System.out.println("Expanded String: " + result.toString());
    }
}
