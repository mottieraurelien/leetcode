package aurelienmottier.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("scenarios")
    void should_convert_the_roman_number_into_an_integer_when_the_roman_number_is_valid(
            final String inputRomainNumber, final int expectedInteger) {

        // [Arrange]
        final Solution solution = new Solution();

        // [Act]
        final int actual = solution.romanToInt(inputRomainNumber);

        // [Assert]
        assertThat(actual).isEqualTo(expectedInteger);

    }

    @SuppressWarnings("unused")
    private static Stream<Arguments> scenarios() {
        return Stream.of(
                of("III", 3),
                of("LVIII", 58),
                of("MCMXCIV", 1994)
        );
    }

}