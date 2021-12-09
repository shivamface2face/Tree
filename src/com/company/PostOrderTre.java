package com.company;

public class PostOrderTre {
    public static void main(String[] args) {


        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.right.right=new Node(50);
        root.right.right.left=new Node(60);


        PostOrder(root);

    }

    static void PostOrder(Node root) {
        if (root!=null){
            PostOrder(root.left);

            PostOrder(root.right);

            System.out.println(root.key);

        }


    }
}
