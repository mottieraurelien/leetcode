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
    void should_return_true_when_a_giving_sentence_is_a_valid_palindrome(
            final String inputSentence, final boolean expectedBoolean) {

        // [Arrange]
        final Solution solution = new Solution();

        // [Act]
        final boolean actual = solution.isPalindrome(inputSentence);

        // [Assert]
        assertThat(actual).isEqualTo(expectedBoolean);

    }

    @SuppressWarnings("unused")
    private static Stream<Arguments> scenarios() {
        return Stream.of(
            of("annna", true),
            of("amanaplanacanalpanama", true),
            of("a man, a plan, a canal: panama", true),
            of("A man, a plan, a canal: Panama", true),
            of("race a car", false),
            of(" ", true),
            of("0P", false),
            of("a.", true)
        );
    }

}