public class FindPeakElement {
    public int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (left + right) / 2;

            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid - 1;
            }
        }
        return left;

    }


    public boolean search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (arr[left] == arr[mid] && arr[right] == arr[mid]) {
                left++;
                right--;
                continue;
            }

            if (arr[left] <= arr[mid]) {
                if (target >= nums[left] && target <= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }


    //find the minimum rotated array

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[left] < nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                right--;
            }
        }
        return nums[left];
    }


    //generate all permutations of intger array

    public List<List<Integer>> generatePermutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current,
                           int[] nums, boolean[] used) {
        // If current permutation is complete, add it to result
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try each number that hasn't been used yet
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            // Use current number
            used[i] = true;
            current.add(nums[i]);

            // Recurse to generate remaining permutation
            backtrack(result, current, nums, used);

            // Backtrack by removing the number
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
    // how do you reverse the digits of an integer without converting into a astring


    public int reverse(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MAX_VALUE) {
                return 0;
            }
        }
        return (int) reverse;
    }

   // How can the sum of an array of integers be minimized by repeatedly halving one element and reinserting it?


    

}