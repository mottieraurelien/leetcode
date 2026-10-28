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
    void should_return_the_maximum_profit_when_providing_an_array_of_given_stock_prices(
            final int[] inputStockPrices, final int expectMaxProfit) {

        // [Arrange]
        final Solution solution = new Solution();

        // [Act]
        final int actual = solution.maxProfit(inputStockPrices);

        // [Assert]
        assertThat(actual).isEqualTo(expectMaxProfit);

    }

    @SuppressWarnings("unused")
    private static Stream<Arguments> scenarios() {
        return Stream.of(
            of(new int[]{7,1,5,3,6,4}, 5),
            of(new int[]{7,6,4,3,1}, 0),
            of(new int[]{40,50,30,5,25,10,35,20,25 }, 30),
            of(new int[]{2,4,1}, 2),
            of(new int[]{3,2,6,5,0,3}, 4),
            of(new int[]{4,7,2,1}, 3)
        );
    }

}