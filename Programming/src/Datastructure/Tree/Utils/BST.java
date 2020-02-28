package Datastructure.Tree.Utils;

import java.util.ArrayList;

public class BST {
    public TreeNode node;
    public ArrayList data;

    public static void main(String[] args) {
        BST obj = new BST();
        /* Let us create following BST
            50
          /   \
        30      70
        / \   / \
       20 40 60 80 */

        obj.node = obj.createBST(obj.node);
        //obj.inOrderTravel(obj.node);
        obj.data=new ArrayList();
        obj.data=obj.preOrderData(obj.node,obj.data);
        System.out.println(obj.data);
    }

    public TreeNode createBST(TreeNode root) {
        root = insertIntoBST(root, 50);
        insertIntoBST(root, 30);
        insertIntoBST(root, 70);
        insertIntoBST(root, 40);
        insertIntoBST(root, 20);
        insertIntoBST(root, 60);
        insertIntoBST(root, 80);
        return root;
    }

    public TreeNode insertIntoBST(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        } else if (root.data > data) {
            root.leftNode = insertIntoBST(root.leftNode, data);
        } else if (root.data < data) {
            root.rightNode = insertIntoBST(root.rightNode, data);
        }
        return root;
    }

    public void inOrderTravel(TreeNode root) {
        if (root != null) {
            inOrderTravel(root.leftNode);
            System.out.print(root.data + ",");
            inOrderTravel(root.rightNode);
        }
    }

    public ArrayList preOrderData(TreeNode root,ArrayList al){
        if(root==null){
            return al;
        }else{
            al.add(root.data);
            preOrderData(root.leftNode,al);
            preOrderData(root.rightNode,al);
            return al;
        }
    }
}
