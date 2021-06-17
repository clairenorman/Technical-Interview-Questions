import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithoutRepeatingCharacters {
    /*
    Given a string, find the length of the longest substring without repeating characters

    Example:
        input: "abcabcbb"
        output: 3
    */

    public static void main(String[] args) {
        String s = "abcabcbb";
        int output = longest(s);
        System.out.println("result: " + output);
        s = "bbbbbbb";
        output = longest(s);
        System.out.println("result: " + output);
        s = "pwwkew";
        output = longest(s);
        System.out.println("result: " + output);
    }

    public static int longest(String s) {
        int longest = 0;
        Set<Character> hash_Set = new HashSet<Character>();

        for(int i = 0; i < s.length(); i++) {
            hash_Set.add(s.charAt(i));
            for(int j = i + 1; j < s.length() - 1; j++) {
                if(!hash_Set.contains(s.charAt(j))) {
                    hash_Set.add(s.charAt(j));
                } else {
                    
                    break;
                }
            }
            if(hash_Set.size() > longest) {
                longest = hash_Set.size();
            }
            hash_Set.clear();
        }
        return longest;
    }
}
