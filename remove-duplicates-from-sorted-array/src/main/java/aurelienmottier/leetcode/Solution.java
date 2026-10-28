package aurelienmottier.leetcode;

class Solution {

    /*
        The leetcode description has very bad wording.
        Actually, leetcode will expect you to slide unique numbers at the beginning of the array.
        What's left behind does not matter (leetcode will check your fist k number is they match expectations).

        Bad wording is the reason why leetcoders skipped this coding exercise.
        The key for me to understand is the exercise was "Don't bring any other array/collection into the picture"
     */
    public int removeDuplicates(int[] numbers) {

        int freePosition = 1;
        int numberOfUniqueFigures = numbers.length > 0 ? 1 : 0;
        Integer previousUniqueNumber = numbers.length > 0 ? numbers[0] : null;

        for (int i = 1; i < numbers.length; i++) {

            final int currentNumber = numbers[i];

            if (previousUniqueNumber >= currentNumber) {
                continue;
            }

            numbers[freePosition] = previousUniqueNumber = currentNumber;
            freePosition++;
            numberOfUniqueFigures++;

        }

        return numberOfUniqueFigures;

    }

}