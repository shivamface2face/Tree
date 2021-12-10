package com.company;

public class MinimunInTree {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.right.right=new Node(50);
        root.right.right.left=new Node(60);
        int ans=mainimumValeInTree(root);
        System.out.println(ans);
    }

    static int mainimumValeInTree(Node root) {
        if (root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.key, Math.min(mainimumValeInTree(root.left),mainimumValeInTree(root.right)));
    }
}
