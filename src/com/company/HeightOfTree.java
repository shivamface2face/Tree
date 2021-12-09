package com.company;

public class HeightOfTree {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.right.right=new Node(50);
        root.right.right.left=new Node(60);

      int ans=  Height(root);
        System.out.println(ans);
    }

        static  int Height(Node root) {
        if (root==null){
            return -1;
        }
        return Math.max(Height(root.left),Height(root.right))+1;
    }
}
