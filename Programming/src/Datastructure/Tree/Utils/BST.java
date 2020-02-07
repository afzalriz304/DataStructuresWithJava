package Datastructure.Tree.Utils;

public class BST {
    Node node;

    static class Node {
        int data;
        Node leftNode;
        Node rightNode;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        BST obj=new BST();
        /* Let us create following BST
            50
          /   \
        30      70
        / \   / \
       20 40 60 80 */

        obj.node=obj.insertIntoBST(obj.node,50);
        obj.insertIntoBST(obj.node,30);
        obj.insertIntoBST(obj.node,70);
        obj.insertIntoBST(obj.node,40);
        obj.insertIntoBST(obj.node,20);
        obj.insertIntoBST(obj.node,60);
        obj.insertIntoBST(obj.node,80);

        obj.inOrderTravel(obj.node);
    }

    public Node insertIntoBST(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }else if(root.data>data){
            root.leftNode=insertIntoBST(root.leftNode,data);
        }else if(root.data<data){
            root.rightNode=insertIntoBST(root.rightNode,data);
        }
        return root;
    }

    public void inOrderTravel(Node root) {
        if (root != null) {
            inOrderTravel(root.leftNode);
            System.out.print(root.data + ",");
            inOrderTravel(root.rightNode);
        }
    }
}
