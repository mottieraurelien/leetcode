package aurelienmottier.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;

/*
    Requirements (leetcode): merge items into nums1 (which is bad practice) + within O(m+n) time complexity.
    Note: to accommodate this (first requirement), nums1 has a length of m + n.
 */
class SolutionTest {

    @ParameterizedTest
    @MethodSource("scenarios")
    void should_preserve_non_decreasing_order_when_merging_items_from_second_array_into_first_array(
            int[] inputFirstArray, int inputFirstArrayLength, int[] inputSecondArray, int inputSecondArrayLength, int[] expectedMergedArray) {

        // [Arrange]
        final Solution solution = new Solution();

        // [Act]
        solution.merge(inputFirstArray, inputFirstArrayLength, inputSecondArray, inputSecondArray.length);

        // [Assert]
        assertThat(inputFirstArray).isEqualTo(expectedMergedArray);

    }

    @SuppressWarnings("unused")
    private static Stream<Arguments> scenarios() {
        return Stream.of(
            of(new int[]{ 1,2,3,0,0,0 }, 3, new int[]{ 2,5,6 }, 3, new int[]{ 1,2,2,3,5,6 }),
            of(new int[]{ 1 }, 1, new int[]{  }, 0, new int[]{ 1 }),
            of(new int[]{ 0 }, 0, new int[]{ 1 }, 1, new int[]{ 1 }),
            of(new int[]{ 4,0,0,0,0,0 }, 1, new int[]{ 1,2,3,5,6 }, 5, new int[]{ 1,2,3,4,5,6 }),
            of(new int[]{ 4,5,6,0,0,0 }, 3, new int[]{ 1,2,3 }, 3, new int[]{ 1,2,3,4,5,6 }),
            of(new int[]{ -1,0,0,3,3,3,0,0,0 }, 6, new int[]{ 1,2,2 }, 3, new int[]{ -1,0,0,1,2,2,3,3,3 }),
            of(new int[]{ 0,0,3,0,0,0,0,0,0 }, 3, new int[]{ -1,1,1,1,2,3}, 6, new int[]{ -1,0,0,1,1,1,2,3,3 })
        );
    }

}