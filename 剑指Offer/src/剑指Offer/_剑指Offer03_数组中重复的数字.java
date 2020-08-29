package 剑指Offer;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 * 
 * @author Administrator 输入： [2, 3, 1, 0, 2, 5, 3] 输出：2 或 3
 */
public class _剑指Offer03_数组中重复的数字 {
	public int findRepeatNumber(int[] nums) {
		int temp = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (temp == nums[i+1]) {
				return nums[i];
			}
			temp = nums[i];
		}
		return nums[-1];
	}
}
