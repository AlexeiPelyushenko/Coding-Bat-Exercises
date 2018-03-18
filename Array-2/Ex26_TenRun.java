
public class Ex26_TenRun
{
	// For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until
	// encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
	public int[] tenRun(int[] nums)
	{
		int i = 0;
		while (i < nums.length && nums[i] % 10 != 0)
			i++;
		if (i == nums.length)
			return nums;

		for (int mult = nums[i]; i < nums.length; i++)
			if (nums[i] % 10 == 0)
				mult = nums[i];
			else
				nums[i] = mult;
		return nums;
	}
}
