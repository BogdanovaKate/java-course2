package Task11;

import java.util.*;

public class FrequentLetter {
    static Set<Character> NUMBERS = new HashSet<Character>(){{
        add('0');
        add('1');
        add('2');
        add('3');
        add('4');
        add('5');
        add('6');
        add('7');
        add('8');
        add('9');
    }};
    public static char mostFrequentLetter(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> mostFrequentLetter = new HashMap<Character, Integer>();
        for (int i = 0; i < chars.length; i++) {
            if (mostFrequentLetter.containsKey(chars[i]) && chars[i] != ' ' && !NUMBERS.contains(chars[i])) {
                int count = mostFrequentLetter.get(chars[i]);
                mostFrequentLetter.put(chars[i], count + 1);
            } else {
                if (chars[i] != ' ' && !NUMBERS.contains(chars[i])) {
                    mostFrequentLetter.put(chars[i], 1);
                }
            }
        }
        if (!mostFrequentLetter.isEmpty()) {
            int max = Collections.max(mostFrequentLetter.values());
            for (Map.Entry<Character, Integer> entry : mostFrequentLetter.entrySet()) {
                if (entry.getValue() == max) {
                    return entry.getKey();
                }
            }
        } else throw new IllegalArgumentException("Строка пустая или не содержит букв");
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(mostFrequentLetter("Lorem ipsum"));
        System.out.println(mostFrequentLetter("Lorem ipsum dolor sit amet, consectetur e"));
        System.out.println(mostFrequentLetter("abba"));
        //System.out.println(mostFrequentLetter(" "));
        System.out.println(mostFrequentLetter("12341aa"));
    }
}

