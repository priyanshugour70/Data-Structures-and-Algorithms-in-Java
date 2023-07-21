import java.util.LinkedHashMap;
import java.util.Map;

public class p16_firstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "hello world";
        char firstNonRepeatedChar = findFirstNonRepeatedChar(str);
        System.out.println("The first non-repeated character in \"" + str + "\" is: " + firstNonRepeatedChar);
    }

    public static char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>(); // Using LinkedHashMap to maintain insertion order
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1); // Increment character count in the map
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) { // Check for non-repeated character
                return entry.getKey();
            }
        }
        return '\0'; // Return null character if no non-repeated character is found
    }
}
