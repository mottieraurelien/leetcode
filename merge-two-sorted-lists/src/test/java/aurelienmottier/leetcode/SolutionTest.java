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
    void should_splice_all_nodes_from_first_two_lists_when__merging_them_into_one_sorted_list(
            final ListNode inputFirstList, final ListNode inputSecondList, final ListNode expectedMergedList) {

        // [Arrange]
        final Solution solution = new Solution();

        // [Act]
        final ListNode actual = solution.mergeTwoLists(inputFirstList, inputSecondList);

        // [Assert]
        assertThat(actual).isEqualTo(expectedMergedList);

    }

    @SuppressWarnings("unused")
    private static Stream<Arguments> scenarios() {
        return Stream.of(
            of(new ListNode(1, new ListNode(2, new ListNode(4))), new ListNode(1, new ListNode(3, new ListNode(4))), new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))))),
            of(new ListNode(), new ListNode(), new ListNode()),
            of(new ListNode(), new ListNode(0), new ListNode(0))
        );
    }

}