
public class Ex22_MidThree
{
	// Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the
	// array. The array length will be at least 3.
	public int[] midThree(int[] nums)
	{
		int s = nums.length / 2 - 1;
		return new int[] { nums[s], nums[s + 1], nums[s + 2] };
	}
}
