class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        //鉴于自定义排序的时间复杂度很高，所以采用计数循环的思路【以时间换空间】
        //1.遍历arr1，记录每个数出现的次数，记录数组长度为【1001】
        //2.将arr2中出现的数加入结果数组
        //3.将arr2中没出现的数加入结果数组（记录数组本身就是升序的，0-1001）
        int[] res = new int[arr1.length];
        int index = 0;
        int[] times = new int[1001];  //因为数范围在0-1000
        for (int num : arr1) times[num]++;  //遍历arr1
        for (int num : arr2) {          //遍历arr2
            while (times[num] > 0) {
                res[index++] = num;
                times[num]--;
            }
        }
        for (int i = 0; i < times.length; i++) {
            while (times[i] > 0) {
                res[index++] = i;
                times[i]--;
            }
        }
        return res;
    }
}
//        作者：sunflower-zzn
//        链接：https://leetcode-cn.com/problems/relative-sort-array/solution/javasan-chong-jie-fa-zi-ding-yi-pai-xu-ji-shu-pai-/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
