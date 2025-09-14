package INFLEARN;

public class Class7_9 {
    static Node root;

    public static int dfs(int l, Node root) {
        if (root.lt == null && root.rt == null) {
            return l;
        } else {
            return Math.min(dfs(l + 1, root.lt), dfs(l + 1, root.rt));
        }
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        System.out.println(dfs(0, root));
    }
}
