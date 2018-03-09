
public class Ex19_MakeMiddle
{
	// Given an array of ints of even length, return a new array length 2 containing the middle two elements from the
	// original array. The original array will be length 2 or more.
	public int[] makeMiddle(int[] nums)
	{
		int mid = nums.length / 2 - 1;
		return new int[] { nums[mid], nums[mid + 1] };
	}
}
