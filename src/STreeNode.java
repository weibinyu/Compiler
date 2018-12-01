import grail.simpletree.TreeNode;

import java.util.Iterator;

public class STreeNode extends TreeNode {
    private Object item;
    private TreeNode parent;

    public STreeNode(Object item, TreeNode parent) {
        super(item, parent);
        this.item = item;
        this.parent = parent;
    }

    @Override
    public boolean addChild(TreeNode treeNode) {
        return false;
    }

    @Override
    public boolean removeChild(TreeNode treeNode) {
        return false;
    }

    @Override
    public Iterator<TreeNode> children() {
        return null;
    }

    @Override
    public TreeNode firstChild() {
        return null;
    }

    @Override
    public TreeNode lastChild() {
        return null;
    }

    @Override
    public int childSize() {
        return 0;
    }

    @Override
    public Object clone() {
        return null;
    }
}
