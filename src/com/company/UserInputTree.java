package com.company;

import java.util.Scanner;

public class UserInputTree {
    public static void main(String[] args) {
        Node root=null;
        root=  CreateBinaryTree(root);
       ShowTreeData(root);
    }

        static void ShowTreeData(Node root) {
         if (root==null){
            return;
         }
         System.out.println(root.key);
         ShowTreeData(root.left);
         ShowTreeData(root.right);

    }

     static Node CreateBinaryTree(Node root) {

        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        if (n==-1){
            return null;
        }
        Node crrent=new Node(n);
        root=crrent;
        System.out.println("left"+root.key);
        root.left=  CreateBinaryTree(root.left);
        System.out.println("right"+root.key);
        root.right=  CreateBinaryTree(root.right);
         return  root;
    }

}
