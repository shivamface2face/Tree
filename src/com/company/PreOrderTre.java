package com.company;

public class PreOrderTre {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.right.right=new Node(50);
        root.right.right.left=new Node(60);


        PreOrder(root);

    }

    static void PreOrder(Node root) {
        if (root!=null){
            System.out.println(root.key);

            PreOrder(root.left);

            PreOrder(root.right);

        }
    }
}
