package com.company;

public class NodeAtDistanceK {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.right.right=new Node(50);
        root.right.right.left=new Node(60);

        int key=2;
        NodeatDistancek(root,key);
    }

    static void NodeatDistancek(Node root,int key) {
        if (root==null){
            return;
        }
        if (key==0){
            System.out.println(root.key);;
        }else {
            NodeatDistancek(root.left,key-1);
            NodeatDistancek(root.right,key-1);
        }
    }
}
