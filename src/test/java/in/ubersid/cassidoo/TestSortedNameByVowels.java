package in.ubersid.cassidoo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestSortedNameByVowels {

    public static Stream<Arguments> testArgumentSources() {
        return Stream.of(
                Arguments.of(new String[]{"Goku", "Vegeta", "Piccolo", "Gohan"}, new String[]{"Piccolo", "Vegeta", "Gohan", "Goku"}),
                Arguments.of(new String[]{"Edward", "Alphonse", "Roy", "Winry"}, new String[]{"Alphonse", "Edward", "Winry", "Roy"})
        );
    }

    @ParameterizedTest
    @MethodSource("testArgumentSources")
    void testSortedByVowels(String[] input, String[] expected) {
        SortedNameByVowels sorter = new SortedNameByVowels();
        String[] output = sorter.sortNames(input);
        assertArrayEquals(expected, output);
    }

}