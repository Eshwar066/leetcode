class Solution {                       //DFS
   public int numEnclaves(int[][] g) {
        int res = 0;
        for (int i = 0; i < g.length; ++i) {
            for (int j = 0; j < g[0].length; ++j) {
                if (i * j * (i - g.length + 1) * (j - g[0].length + 1) == 0)
                    fill(g, i, j);
            }
        }
        for (int i = 0; i < g.length; ++i) {
            for (int j = 0; j < g[0].length; ++j)
                res += g[i][j];
        }
        return res;
    }
    private void fill(int[][] g, int i, int j) {
        if (i < 0 || i >= g.length || j < 0 || j >= g[0].length || g[i][j] == 0)
            return;
        g[i][j] = 0;
        fill(g, i + 1, j);
        fill(g, i - 1, j);
        fill(g, i, j + 1);
        fill(g, i, j - 1);
    }
}