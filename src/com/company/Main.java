package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.right.right=new Node(50);
        root.right.right.left=new Node(60);

    }
}
