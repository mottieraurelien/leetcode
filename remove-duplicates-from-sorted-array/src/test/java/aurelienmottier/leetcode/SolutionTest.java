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
    void should_return_the_number_of_deduplicated_numbers_when_a_list_contains_duplicates(
            final int[] inputNumbers, final int expectedNumberOfUniqueNumbers) {

        // [Arrange]
        final Solution solution = new Solution();

        // [Act]
        final int actual = solution.removeDuplicates(inputNumbers);

        // [Assert]
        assertThat(actual).isEqualTo(expectedNumberOfUniqueNumbers);

    }

    @SuppressWarnings("unused")
    private static Stream<Arguments> scenarios() {
        return Stream.of(
            of(new int[]{1,1,2}, 2),
            of(new int[]{0,0,1,1,1,2,2,3,3,4}, 5)
        );
    }

}