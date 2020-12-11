/**
 * 时间复杂度为 O(logN)O(logN)
 */
//class Solution {
//    public boolean isPowerOfTwo(int n) {
//        if (n == 0) return false;
//        while (n % 2 == 0) n /= 2;
//        return n == 1;
//    }
//}


/**
 * 时间复杂度：O(1)O(1)。
 * 空间复杂度：O(1)O(1)。
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        long x = (long) n;
        return (x & (x - 1)) == 0;
    }
}
