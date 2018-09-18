package com.lee.learn.dp.structualpattern.composite;

public class Tree<T> {
    private TreeNode<T> root;

    public Tree() {
        root = new TreeNode<>("root");
    }
}
