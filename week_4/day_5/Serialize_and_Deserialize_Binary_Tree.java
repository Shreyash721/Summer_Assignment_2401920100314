public class Codec {

    public String serialize(TreeNode root) {

        StringBuilder sb = new StringBuilder();
        build(root, sb);

        return sb.toString();
    }

    public void build(TreeNode root, StringBuilder sb) {

        if(root == null) {
            sb.append("null,");
            return;
        }

        sb.append(root.val).append(",");

        build(root.left, sb);
        build(root.right, sb);
    }

    public TreeNode deserialize(String data) {

        String[] arr = data.split(",");
        Queue<String> q = new LinkedList<>();

        for(String s : arr) {
            q.offer(s);
        }

        return create(q);
    }

    public TreeNode create(Queue<String> q) {

        String curr = q.poll();

        if(curr.equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(curr));

        root.left = create(q);
        root.right = create(q);

        return root;
    }
}