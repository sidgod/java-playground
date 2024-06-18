package in.ubersid.cassidoo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedNameByVowels {

    private int countVowels(String text) {
        return (int) text.chars().mapToObj(c -> (char) c).filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U').count();
    }

    public String[] sortNames(String[] names) {
        List<String> nameList = Arrays.asList(names);
        nameList.sort((o1, o2) -> countVowels(o1) - countVowels(o2));
        Collections.reverse(nameList);
        return nameList.toArray(new String[]{});
    }

}
