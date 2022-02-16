/*
    Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

    A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

    0 <= i < j < nums.length
    |nums[i] - nums[j]| == k
    Notice that |val| denotes the absolute value of val.

 */
import java.util.HashMap;

public class KDiff {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        System.out.println(findPairs(nums, 0));
    }

    public static int findPairs(int[] nums, int k) {
        int kZeroCount = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i: nums)  {
            if(!map.containsKey(i))    map.put(i, 1);
            else    {
                map.put(i, map.get(i) + 1);
            }
        }
        for(int i: map.keySet())    {
            if(map.containsKey(i+k)) count++;
            if(map.containsKey(i-k)) count++;
            if(map.get(i) > 1) kZeroCount++;
        }
        if(k == 0) return kZeroCount;
        return count/2;
    }
}
