package Task11;

import java.util.HashSet;
import java.util.Set;


public class Main {

    public static void main(String[] args) {
        System.out.println(countVowels("ABCDE"));
        System.out.println(countVowels("Abcde"));
        System.out.println(countVowels("ABcd"));
        System.out.println(countVowels("AEOU"));
        System.out.println(countVowels(""));
        System.out.println(countVowels("ABC DEu"));
    }
    public final static int countVowels(String input) {
        int count = 0;
        char[] result = input.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (VOWELS.contains(result[i])) {
                count++;
            }
        }
        return count;
    }
     static Set<Character> VOWELS = new HashSet<Character>() {{
        add('a');
        add('e');
        add('u');
        add('o');
        add('i');
        add('A');
        add('E');
        add('U');
        add('O');
        add('I');
    }};

}

