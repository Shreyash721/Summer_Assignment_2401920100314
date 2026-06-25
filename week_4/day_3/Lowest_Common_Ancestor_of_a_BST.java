class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean leftToRight = true;

        while(!q.isEmpty()) {

            int n = q.size();
            List<Integer> curr = new ArrayList<>();

            for(int i = 0; i < n; i++) {

                TreeNode node = q.poll();

                if(leftToRight) {
                    curr.add(node.val);
                }
                else {
                    curr.add(0, node.val);
                }

                if(node.left != null) {
                    q.offer(node.left);
                }

                if(node.right != null) {
                    q.offer(node.right);
                }
            }

            ans.add(curr);
            leftToRight = !leftToRight;
        }

        return ans;
    }
}