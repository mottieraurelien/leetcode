package aurelienmottier.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void should_return_indexes_zero_and_one_when_the_targeted_sum_is_nine() {

        // [Arrange]
        final int[] numbers = new int[]{2, 7, 11, 15};
        final Solution solution = new Solution();

        // [Act]
        final int[] actual = solution.twoSum(numbers, 9);

        // [Arrange]
        assertThat(actual).containsExactly(0, 1);

    }

    @Test
    void should_return_indexes_one_and_two_when_the_targeted_sum_is_six() {

        // [Arrange]
        final int[] numbers = new int[]{3, 2, 4};
        final Solution solution = new Solution();

        // [Act]
        final int[] actual = solution.twoSum(numbers, 6);

        // [Arrange]
        assertThat(actual).containsExactly(1, 2);

    }

    @Test
    void should_return_indexes_zero_and_one_when_the_targeted_sum_is_six() {

        // [Arrange]
        final int[] numbers = new int[]{3, 3};
        final Solution solution = new Solution();

        // [Act]
        final int[] actual = solution.twoSum(numbers, 6);

        // [Arrange]
        assertThat(actual).containsExactly(0, 1);

    }

    @Test
    void should_return_an_empty_list_when_there_is_no_solution_to_match_the_targeted_sum() {

        // [Arrange]
        final int[] numbers = new int[]{1, 3, 4, 5, 7, 10, 11};
        final Solution solution = new Solution();

        // [Act]
        final int[] actual = solution.twoSum(numbers, 22);

        // [Arrange]
        assertThat(actual).isEmpty();

    }

}