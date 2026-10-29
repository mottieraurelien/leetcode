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
    void should_ensure_log_n_time_complexity_when_looking_for_a_number_in_a_sorted_array(
            final int[] inputNumber, final int inputTargetNumber, final int expectedIndexTargetNumber) {

        // [Arrange]
        final Solution solution = new Solution();

        // [Act]
        final int actual = solution.search(inputNumber, inputTargetNumber);

        // [Assert]
        assertThat(actual).isEqualTo(expectedIndexTargetNumber);

    }

    @SuppressWarnings("unused")
    private static Stream<Arguments> scenarios() {
        return Stream.of(
            of(new int[]{ 5 }, 5, 0),
            of(new int[]{ 0, 1, 2, 3, 4, 5 }, 4, 4),
            of(new int[]{ -1, 0, 3, 5, 9, 12 }, 9, 4),
            of(new int[]{ -1, 0, 3, 5, 9, 12 }, 3, 2),
            of(new int[]{ -1, 0, 3, 5, 9, 12 }, 0, 1),
            of(new int[]{ -1, 0, 3, 5, 9, 12 }, 2, -1)
        );
    }

}