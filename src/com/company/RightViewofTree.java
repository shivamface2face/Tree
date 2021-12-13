package com.company;

public class RightViewofTree {
    public static void main(String[] args) {

        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.right.right=new Node(50);
        root.right.right.left=new Node(60);
        int level=1;
      Rightviewoftree(root,level);
    }
    static   int maxLavel=0;
    static void Rightviewoftree(Node root, int level) {
        if (root==null){
            return;
        }
        if (maxLavel<level){
            System.out.print(root.key+" ");
            maxLavel=level;
        }

        Rightviewoftree(root.right,level+1);
        Rightviewoftree(root.left,level+1);

    }
}