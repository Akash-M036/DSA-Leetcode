import java.util.ArrayList;
import java.util.List;

class Solution {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    List<List<Integer>> ans = new ArrayList<>();
    List<List<int[]>> tempAns = new ArrayList<>();

    public void dfslength(TreeNode root, int x) {
        if (root == null) {
            return;
        }
        max = Math.max(max, x);
        min = Math.min(min, x);
        dfslength(root.left, x - 1);
        dfslength(root.right, x + 1);
    }

    public void dfs(TreeNode root, int idx, int y, int offset) {
        if (root == null) {
            return;
        }
        int value = idx + offset;
        tempAns.get(value).add(new int[]{root.val, y});
        dfs(root.left, idx - 1, y + 1, offset);
        dfs(root.right, idx + 1, y + 1, offset);
    }

    public void customSort(List<int[]> list) {
        if (list == null || list.size() <= 1) {
            return;
        }
        list.sort((a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if (root == null) {
            return ans;
        }
        
        dfslength(root, 0);
        int offset = -min;
        
        for (int i = min; i <= max; i++) {
            tempAns.add(new ArrayList<>());
            ans.add(new ArrayList<>());
        }
        
        dfs(root, 0, 0, offset);
        
        for (int i = 0; i < tempAns.size(); i++) {
            List<int[]> colNodes = tempAns.get(i);
            customSort(colNodes);
            for (int[] node : colNodes) {
                ans.get(i).add(node[0]);
            }
        }
        return ans;
    }
}
