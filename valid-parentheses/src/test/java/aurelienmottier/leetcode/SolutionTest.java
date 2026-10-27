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
    void should_return_true_when_a_giving_string_has_all_its_loops_closed(
            final String inputSentence, final boolean expectedBoolean) {

        // [Arrange]
        final Solution solution = new Solution();

        // [Act]
        final boolean actual = solution.isValid(inputSentence);

        // [Assert]
        assertThat(actual).isEqualTo(expectedBoolean);

    }

    @SuppressWarnings("unused")
    private static Stream<Arguments> scenarios() {
        return Stream.of(
                of("()", true),
                of("()[]{}", true),
                of("(]", false),
                of("([])", true),
                of("([)]", false),
                of("]", false)
        );
    }

}