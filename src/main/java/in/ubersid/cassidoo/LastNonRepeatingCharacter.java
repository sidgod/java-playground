package in.ubersid.cassidoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LastNonRepeatingCharacter {

    public Character getLastNonRepeatingCharacter(String str) {
        final char[] chars = str.toCharArray();
        final Map<Character, Integer> duplicates = new HashMap<>();
        IntStream.range(0, chars.length).mapToObj(i -> chars[i]).forEach(c -> {
            duplicates.merge(c, 1, Integer::sum);
        });
        final Set<Character> duplicateChars = duplicates.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        for(int i=chars.length - 1; i >= 0; i--) {
            if(!duplicateChars.contains(chars[i])) {
                return chars[i];
            }
        }
        return null;
    }
}
