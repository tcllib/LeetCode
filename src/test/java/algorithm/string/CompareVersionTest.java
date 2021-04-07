package algorithm.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompareVersionTest {
    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(0, "1.01", "1.001"),
                Arguments.of(0, "1.0", "1.0.0"),
                Arguments.of(-1, "0.1", "1.1"),
                Arguments.of(1, "1.0.1", "1"),
                Arguments.of(-1, "7.5.2.4", "7.5.3")
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void name(int output, String version1, String version2) {
        CompareVersion compareVersion = new CompareVersion();
        assertEquals(output, compareVersion.compareVersion(version1, version2));
    }
}
