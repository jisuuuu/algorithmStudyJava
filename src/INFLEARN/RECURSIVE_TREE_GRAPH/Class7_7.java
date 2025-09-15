package INFLEARN.RECURSIVE_TREE_GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class Class7_7 {
    static Node root;

    public static void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int l = 0;

        while (!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(l + " : ");

            for (int i = 0; i < len; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");

                if (current.lt != null) {
                    queue.offer(current.lt);
                }
                if (current.rt != null) {
                    queue.offer(current.rt);
                }
            }
            l++;
            System.out.println();
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

        bfs(root);
    }
}
