package 打家劫舍198;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素
 * 就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,2,3,1]
 * 输出：4
 * 解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 * 示例 2：
 *
 * 输入：[2,7,9,3,1]
 * 输出：12
 * 解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 *  
 *
 * 提示：
 *
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 400
 *

 */
public class Solution {
    public int robs(int[] nums) {

        int t=0;
        for (int i = 0; i < nums.length; i++) {
            t=t+nums[i]+nums[i+2];
        }
        return 0;
    }
//    public int robss(int[] nums){
//int prev=0
//    int curr = 0;
//
//    // 每次循环，计算「偷到当前房子为止的最大金额」
//    for (int i : nums) {
//        // 循环开始时，curr 表示 dp[k-1]，prev 表示 dp[k-2]
//        // dp[k] = max{ dp[k-1], dp[k-2] + i }
//        int temp = Math.max(curr, prev + i);
//prev = curr;
//curr = temp;
//        // 循环结束时，curr 表示 dp[k]，prev 表示 dp[k-1]
//    }
//
//    return curr;
//    }
//
public int robss(int[] nums){
    int prev=0;
    int curr=0;
    for (int num : nums) {
        int temp=Math.max(curr,prev+num);
        prev = curr;
        curr = temp;
    }
    return curr;
    }
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        // 子问题：
        // f(k) = 偷 [0..k) 房间中的最大金额

        // f(0) = 0
        // f(1) = nums[0]
        // f(k) = max{ rob(k-1), nums[k-1] + rob(k-2) }

//        int N = nums.length;
//        int[] dp = new int[N+1];
//        dp[0] = 0;
//        dp[1] = nums[0];
//        for (int k = 2; k <= N; k++) {
//            dp[k] = Math.max(dp[k-1], nums[k-1] + dp[k-2]);
//        }
//        return dp[N];
        int length = nums.length;
        int[] ints = new int[length + 1];
        ints[0]=0;
        ints[1]=nums[0];
        for (int i = 2; i <=length; i++) {
            ints[i]=Math.max(ints[i-1],ints[i-2]+nums[i-1]);
        }
        return ints[length];


    }



}
