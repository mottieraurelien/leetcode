package aurelienmottier.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void should_return_true_when_the_number_is_a_palindrome() {

        // [Arrange]
        final Solution solution = new Solution();

        // [Act]
        final boolean actual = solution.isPalindrome(121);

        // [Assert]
        assertThat(actual).isTrue();

    }

    @Test
    void should_return_false_when_the_number_is_not_a_palindrome() {

        // [Arrange]
        final Solution solution = new Solution();

        // [Act]
        final boolean actual = solution.isPalindrome(-121);

        // [Assert]
        assertThat(actual).isFalse();

    }

    @Test
    void should_return_false_when_the_number_is_negative() {

        // [Arrange]
        final Solution solution = new Solution();

        // [Act]
        final boolean actual = solution.isPalindrome(10);

        // [Assert]
        assertThat(actual).isFalse();

    }

}