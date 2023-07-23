class Solution {
    private int[][] directions = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};

    public double knightProbability(int N, int K, int r, int c) {
        double[][] dp = new double[N][N];
        dp[r][c] = 1.0;

        for (int move = 0; move < K; move++) {
            double[][] temp = new double[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    for (int[] dir : directions) {
                        int nextRow = i + dir[0];
                        int nextCol = j + dir[1];
                        if (isValid(N, nextRow, nextCol)) {
                            temp[nextRow][nextCol] += dp[i][j] / 8.0;
                        }
                    }
                }
            }
            dp = temp;
        }
//
        double probability = 0.0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                probability += dp[i][j];
            }
        }

        return probability;
    }

    private boolean isValid(int N, int row, int col) {
        return row >= 0 && row < N && col >= 0 && col < N;
    }
}
