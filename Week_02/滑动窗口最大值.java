import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class 滑动窗口最大值 {
    public static void main(String[] args) {
        int[] nums = {1,-1};
        int k = 1;
        int[] ints = maxSlidingWindow(nums, k);

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }

    }


    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0)return nums;

        LinkedList<Integer> list = new LinkedList<>();

        int[] result = new int[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {
            while (list.size() != 0 && nums[list.peekLast()] <= nums[i]){
                list.pollLast();
            }

            list.add(i);

            if (list.peek() <= i-k){
                list.poll();
            }

            if (i+1 >= k){
                result[i-k+1] = nums[list.peek()];
            }

        }

        return result;

    }

}
