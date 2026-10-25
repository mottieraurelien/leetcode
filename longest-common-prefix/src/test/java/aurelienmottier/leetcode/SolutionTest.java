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
    void should_determine_the_longest_common_prefix_when_providing_a_list_of_words(
            final String[] inputWords, final String expectedLongestCommonPrefix) {

        // [Arrange]
        final Solution solution = new Solution();

        // [Act]
        final String actual = solution.longestCommonPrefix(inputWords);

        // [Assert]
        assertThat(actual).isEqualTo(expectedLongestCommonPrefix);

    }

    @SuppressWarnings("unused")
    private static Stream<Arguments> scenarios() {
        return Stream.of(
            of(new String[]{ "flower" , "flow", "flight" }, "fl"),
            of(new String[]{ "dog","racecar","car" }, ""),
            of(new String[]{ "","b" }, ""),
            of(new String[]{ "ab", "a" }, "a"),
            of(new String[]{ "a" }, "a"),
            of(new String[]{ "flower" , "flower", "flower", "flower" }, "flower"),
            of(new String[]{ "b","bcb" }, "b")
        );
    }

}