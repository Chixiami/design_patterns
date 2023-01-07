package com.pattern.singleton.demo3;

import java.util.Stack;

/***
 * <p>Description: </p>
 *
 *
 * @return
 * @author chenhan
 * @date 2022/12/7 23:27
 * @version 1.0.0
 *
 */
class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int res = 0;
        // 前一天卖出可以获得的最大利润
        int pre = 0;
        for (int i = 1; i < len; i++) {
            // 利润差
            int diff = prices[i] - prices[i - 1];
            // 状态转移方程：第i天卖出可以获得的最大利润 = 第i-1天卖出的最大利润 + 利润差
            pre = Math.max(pre + diff, 0);
            res = Math.max(res, pre);
        }
        return res;
    }
}