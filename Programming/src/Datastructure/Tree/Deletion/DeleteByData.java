package Datastructure.Tree.Deletion;

import Datastructure.Tree.Utils.BST;
import Datastructure.Tree.Utils.TreeNode;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteByData {
    TreeNode node;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST bst = new BST();
        DeleteByData obj = new DeleteByData();
        obj.node = bst.createBST(bst.node);
        System.out.println("Before deleting node");
        bst.inOrderTravel(obj.node);
        System.out.println();
        System.out.println("enter the node to be deleted");
        int data = scanner.nextInt();
        TreeNode newBST = obj.deleteNode(obj.node, data);
        System.out.println("After deleting node");
        bst.inOrderTravel(newBST);
    }

    public TreeNode deleteNode(TreeNode node, int data) {
        BST bst = new BST();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = bst.preOrderData(node, list);
        TreeNode newBST = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == data) {
                continue;
            } else {
                newBST=createBSTofRemainingNode(newBST, list.get(i));
            }
        }
        return newBST;
    }

    public TreeNode createBSTofRemainingNode(TreeNode node, int data) {
        if (node == null) {
            node = new TreeNode(data);
            return node;
        } else if (node.data > data) {
            node.leftNode = createBSTofRemainingNode(node.leftNode, data);
        } else if (node.data < data) {
            node.rightNode = createBSTofRemainingNode(node.rightNode, data);
        }
        return node;
    }

}
