package learning.algorithm.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 说明：
 * @date 2020/10/29 14:11
 */
public class No1 {
    @Test
    public void testNums(){
        int[] _sum = new int[]{2,7,8,9};
        int[] result =  twoSum(_sum,14);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                result[0] = map.get(target-nums[i]);
                result[1] = i;
            }else{
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
// 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//
//
// 示例:
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
//
// Related Topics 数组 哈希表
// 👍 9419 👎 0


