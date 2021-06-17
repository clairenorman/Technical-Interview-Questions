import java.util.HashSet;

public class firstRecurringCharacter {
    public static void main(String[] args) {
        String s = "DBABA";
        char output = recurringLetter(s);
        System.out.println(output);
        s = "ABCA";
        output = recurringLetter(s);
        System.out.println(output);
        s = "BCABA";
        output = recurringLetter(s);
        System.out.println(output);
    }

    public static Character recurringLetter(String s) {
        HashSet<Character> charSet = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++) {
            if(charSet.contains(s.charAt(i))) {
                return s.charAt(i);
            } else {
                charSet.add(s.charAt(i));
            }
        }
        return null;
    }
}