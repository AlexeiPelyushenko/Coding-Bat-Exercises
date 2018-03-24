
public class Ex01_GroupSum
{
	public boolean groupSum(int start, int[] nums, int target)
	{
		if (target == 0)
			return true;
		if (start >= nums.length)
			return false;
		return groupSum(start + 1, nums, target) || groupSum(start + 1, nums, target - nums[start]);
	}
}
