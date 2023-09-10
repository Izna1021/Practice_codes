class Solution {
    public int countOrders(int n) {
        long mod = 1_000_000_007;
        long result = 1;
        
        for (int i = 1; i <= n; i++) {
            int order = 2 * i - 1;
            result = (result * order * (order + 1) / 2) % mod;
        }
        
        return (int) result;
    }
}
