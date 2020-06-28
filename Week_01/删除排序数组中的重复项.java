public class 删除排序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        int count = nums.length;
        int continNum = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]){
                count--;
            }else {
                nums[continNum] = nums[i];
                continNum++;
            }
        }
        return count;
    }
}
