package TheCompleteCodingInterviewGuide.TreesAndGraphs;

public class TreeNode<T> {
    public TreeNode<T> left;
    public TreeNode<T> right;
    public TreeNode<T> parent;

    private final T data;

    public TreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    public TreeNode(TreeNode left, TreeNode right, T data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public T getData() {
        return data;
    }
}
