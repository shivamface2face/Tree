package com.company;

import javax.swing.plaf.IconUIResource;
import java.util.LinkedList;
import java.util.Queue;

public class LavelOrder {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.right.right=new Node(50);
        root.right.right.left=new Node(60);
        Levelorder(root);
    }

      static void Levelorder(Node root) {
        if (root==null){
            return;
        }
          Queue<Node>q=new LinkedList<Node>();
        q.add(root);
        while (q.isEmpty()==false){
            Node curr=q.poll();
            System.out.print(curr.key+" ");
            if (curr.left!=null){
                q.add(curr.left);
            }
            if (curr.right!=null){
                q.add(curr.right);
            }
        }
    }
}
