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
    void should_reverse_a_given_linked_list_when_containing_more_than_one_item(
            final ListNode inputHead, final ListNode expectedReversedList) {

        // [Arrange]
        final Solution solution = new Solution();

        // [Act]
        final ListNode actual = solution.reverseList(inputHead);

        // [Assert]
        assertThat(actual).isEqualTo(expectedReversedList);

    }

    @SuppressWarnings("unused")
    private static Stream<Arguments> scenarios() {
        return Stream.of(
            of(new ListNode(), new ListNode())
        );
    }

}