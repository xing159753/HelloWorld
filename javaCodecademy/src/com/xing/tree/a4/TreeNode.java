package com.xing.tree.a4;

import java.util.ArrayList;

public class TreeNode {

    public Object data;
    public ArrayList<TreeNode> children;

    public TreeNode(Object data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }

    public void addChild(Object childData) {
        TreeNode child = new TreeNode(children);
        this.children.add(child);
    }

    //removeChild() with TreeNode parameter
    public void removeChild(TreeNode childToRemove) {
        if (this.children.isEmpty()) {
            return;
        } else if (this.children.contains(childToRemove)){
            this.children.remove(childToRemove);
            return;
        } else {
            for (TreeNode child : this.children) {
                child.removeChild(childToRemove);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(30);
        TreeNode child = new TreeNode(26);
        root.addChild(child);
        //Remove child from root
        root.removeChild(child);
        //Print size of root`s children list
        System.out.println(root.children.size());
    }
}
