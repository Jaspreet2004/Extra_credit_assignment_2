public class RatioOfSums {

    public static double findRatio(int[] nums) {
        if (nums == null || nums.length < 4) {
            throw new IllegalArgumentException("Input array must contain at least four numbers.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }

            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest) {
                secondSmallest = num;
            }
        }

        double ratio = (double)(largest + secondLargest) / (smallest + secondSmallest);
        return ratio;
    }

    public static void main(String[] args) {
        int[] nums = {5, 10, 2, 8, 15}; // Example array

        double ratio = findRatio(nums);
        System.out.println("Ratio of sums: " + ratio);
    }
}
