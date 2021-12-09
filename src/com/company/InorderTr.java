package com.company;

public class InorderTr {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.right.right=new Node(50);
        root.right.right.left=new Node(60);
      
        
        InOrder(root);

    }

       static void InOrder(Node root) {
        if (root!=null){
            InOrder(root.left);
            System.out.println(root.key);
            InOrder(root.right);

           }
    }
}
