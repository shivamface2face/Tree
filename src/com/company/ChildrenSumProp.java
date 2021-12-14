package com.company;

public class ChildrenSumProp {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.right.right=new Node(50);
        root.right.right.left=new Node(60);
        System.out.println(IsChildrenSum(root));
    }

      static boolean IsChildrenSum(Node root) {
        if (root==null){
            return true;
        }
        if (root.left==null && root.right==null){
            return true;
        }
        int sum=0;
        if (root.left!=null){
            sum+=root.left.key;
        }
        if (root.right!=null){
            sum+=root.right.key;
        }
        return(root.key==sum && IsChildrenSum(root.left) && IsChildrenSum(root.right));
    }
}
