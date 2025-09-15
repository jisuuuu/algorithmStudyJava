package INFLEARN.RECURSIVE_TREE_GRAPH;

public class Node {
    int data;
    public Node lt;
    public Node rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
