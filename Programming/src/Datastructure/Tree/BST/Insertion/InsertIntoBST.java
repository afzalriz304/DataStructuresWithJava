package Datastructure.Tree.BST.Insertion;

import Datastructure.Tree.Utils.Node;

import java.util.Scanner;

public class InsertIntoBST {
    Node root;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InsertIntoBST obj = new InsertIntoBST();
        Node utils = new Node();
        System.out.println("Enter the root of tree");
        obj.root = new Node();
        obj.root.key = scanner.nextInt();
        System.out.println("Enter the number of node");
        int num__of_nodes = scanner.nextInt();
        Node temp = obj.root;
        while (num__of_nodes > 0) {
            System.out.println("Enter the node data to be added");
            int data = scanner.nextInt();
            obj.insertIntoBST(temp, data);
            num__of_nodes--;
        }
        utils.levelOrderTraversal(obj.root);
    }

    public Node insertIntoBST(Node node, int data) {
        if (node == null) {
            node = new Node();
            node.key=data;
            return node;
        } else if (node.key > data) {
            node.left=insertIntoBST(node.left, data);
        } else if (node.key < data) {
            node.right=insertIntoBST(node.right, data);
        }
        return node;
    }
}
