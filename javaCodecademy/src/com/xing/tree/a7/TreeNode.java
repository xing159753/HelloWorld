package com.xing.tree.a7;

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

    public void addChild(Object childrenData) {
        TreeNode child = new TreeNode(childrenData);
        this.children.add(child);
    }

    public void removeChild(TreeNode childToRemove) {
        if (this.children.isEmpty()) {
            return;
        } else if (this.children.contains(childToRemove)) {
            this.children.remove(childToRemove);
            return;
        } else {
            for (TreeNode child : this.children) {
                child.removeChild(childToRemove);
            }
        }
    }

    //removeChild with data parameter
    public void removeChild(Object data) {
        if (this.children.isEmpty()) {
            return;
        }
        for (TreeNode child : this.children) {
            if (child.data == data) {
                removeChild(child);
                return;
            }
        }
        for (TreeNode child : this.children) {
            child.removeChild(data);
        }
    }
}

