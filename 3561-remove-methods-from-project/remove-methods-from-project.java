class Solution {
    public void dfs(int idx, List<List<Integer>> adj, boolean[] sus) {
        if (sus[idx])
            return;
        sus[idx] = true;
        for (int nei : adj.get(idx)) {
            dfs(nei, adj, sus);
        }
    }

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        boolean[] sus = new boolean[n];
        for (int i = 0; i < invocations.length; i++) {
            int a = invocations[i][0];
            int b = invocations[i][1];
            adj.get(a).add(b);
        }
        dfs(k, adj, sus);
        for (int[] e : invocations) {
            if (!sus[e[0]] && sus[e[1]]) {
                List<Integer> ans = new ArrayList<>();
                for (int i = 0; i < n; i++)
                    ans.add(i);
                return ans;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!sus[i])
                ans.add(i);
        }

        return ans;
    }
}