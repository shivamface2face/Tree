package com.company;

public class SizeOfTree {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.right.right=new Node(50);
        root.right.right.left=new Node(60);

       int ans= Sizeoftree(root);
        System.out.println(ans);
    }

    static int Sizeoftree(Node root) {
        if (root==null){
            return 0;
        }
        return 1+Sizeoftree(root.left)+Sizeoftree(root.right);
    }
}
