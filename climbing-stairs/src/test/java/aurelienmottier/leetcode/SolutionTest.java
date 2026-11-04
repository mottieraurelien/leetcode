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
    void should_return_the_number_of_distinct_ways_when_climbing_a_given_number_of_stairs(
            final int inputNumberOfStairs, final int expectedNumberOfWays) {

        // [Arrange]
        final Solution solution = new Solution();

        // [Act]
        final int actual = solution.climbStairs(inputNumberOfStairs);

        // [Assert]
        assertThat(actual).isEqualTo(expectedNumberOfWays);

    }

    @SuppressWarnings("unused")
    private static Stream<Arguments> scenarios() {
        // When you list all combinations manually (for cases 1 to 5), you can identify the Fibonacci's suite as the
        // solution to implement. Pay attention to the beginning cause the suite does not start with logic (1 and 2).
        return Stream.of(
            of(1, 1),
            of(2, 2),
            of(3, 3),
            of(4, 5),
            of(5, 8),
            of(6, 13),
            of(7, 21)
        );
    }

}