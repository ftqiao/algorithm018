package learning.algorithm.test;

import org.junit.Test;

import java.util.Arrays;

/**
 * 说明：
 */
public class No455 {
    @Test
    public void testFind() {
        int[] gi = {1, 2, 3};
        int[] si = {1, 1};
        int result = findContentChildren(gi,si);
        System.out.println(result);
    }

    /**
     * from lian-zhou
     * 排序后，对每个小孩找饼，只要满足条件，就计数
     */
    public int findContentChildren(int[] g, int[] s) {
        if (g == null || s == null) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int gi = 0, si = 0;
        while (gi < g.length && si < s.length) {
            if (g[gi] <= s[si]) gi++;
            si++;
        }
        return gi;
    }


}
