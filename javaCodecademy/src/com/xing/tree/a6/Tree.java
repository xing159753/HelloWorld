package com.xing.tree.a6;

public class Tree {

    public TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void print() {
        print(this.root, 0);
    }

    public void print(TreeNode current, int level) {
        String levelMarks = "";
        for (int i = 0; i < level; i++) {
            levelMarks += "-- ";
        }
        System.out.println(levelMarks + current.data);
        for (TreeNode child : current.children) {
            print(child, level + 1);
        }
    }

    //Define depthFisstTraversal() below
    public void depthFirstTraversal(TreeNode current) {
        System.out.println(current.data + " ");
        for (TreeNode child : current.children) {
            depthFirstTraversal(child);
        }
    }

    public static void main(String[] args) {
        TreeNode treeRoot = new TreeNode("S");
        TreeNode child1 = new TreeNode("N");
        TreeNode child2 = new TreeNode("O");
        TreeNode grandchild1 = new TreeNode("W");
        TreeNode grandchild2 = new TreeNode("Y");
        treeRoot.addChild(child1);
        treeRoot.addChild(child2);
        child1.addChild(grandchild1);
        child2.addChild(grandchild2);

        Tree tree = new Tree(treeRoot);
        tree.print();

        // Call depthFirstTraversal below
        tree.depthFirstTraversal(treeRoot);
    }
}
