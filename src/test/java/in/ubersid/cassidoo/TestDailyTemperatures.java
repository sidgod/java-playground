package in.ubersid.cassidoo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestDailyTemperatures {

    public static Stream<Arguments> testArgumentSources() {
        return Stream.of(
                Arguments.of(new int[]{70, 70, 70, 75}, new int[]{3, 2, 1, 0}),
                Arguments.of(new int[]{90, 80, 70, 60}, new int[]{0, 0, 0, 0}),
                Arguments.of(new int[]{73, 74, 75, 71, 69, 72, 76, 73}, new int[]{1, 1, 4, 2, 1, 1, 0, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("testArgumentSources")
    void testWarmerTemperatures(int[] input, int[] expected) {
        DailyTemperatures dailyTemperature = new DailyTemperatures();
        int[] output = dailyTemperature.warmerTemperatures(input);
        assertArrayEquals(expected, output);
    }

}