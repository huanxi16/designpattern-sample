package com.lee.learn.dp.structualpattern.composite;

import sun.reflect.generics.tree.Tree;

import java.util.Iterator;
import java.util.Vector;

public class TreeNode<T> {
    private String name;

    private TreeNode<T> parent;

    private Vector<TreeNode> children;

    public TreeNode(String name) {
        this.name = name;
        children = new Vector<>();
    }

    public void add(TreeNode<T> child) {
        children.add(child);
    }

    public boolean remove(TreeNode<T> node) {
        return children.remove(node);
    }

    public boolean remove(String node) {
        Iterator<TreeNode> it = children.iterator();
        while (it.hasNext()) {
            if (!it.next().getName().equals(node)) {
                continue;
            }
            it.remove();
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode<T> getParent() {
        return parent;
    }

    public void setParent(TreeNode<T> parent) {
        this.parent = parent;
    }

    public Vector<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(Vector<TreeNode> children) {
        this.children = children;
    }
}
