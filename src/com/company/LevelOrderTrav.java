package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTrav {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.right.right=new Node(50);
        root.right.right.left=new Node(60);

        LevelorderTraversal(root);
    }

   static void LevelorderTraversal(Node root) {
        if (root==null){
            return;
        }
       Queue<Node>q=new LinkedList<>();
        q.add(root);
        
    }
}
