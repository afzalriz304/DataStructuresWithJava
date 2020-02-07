package Datastructure.Tree.BinaryTree.Traversals;

import Datastructure.Tree.Utils.Node;

public class LevelOrderSpiralTraversal {
    Node root;

    public static void main(String[] args) {
        Node utils = new Node();
        LevelOrderSpiralTraversal obj = new LevelOrderSpiralTraversal();
        obj.root = utils.addNodesToTree();
        int height=utils.heightOfTree(obj.root);
        obj.levelOrderSpiralTraversal(obj.root,height);
    }

    /* to find the level order spiral traversal */
    public void levelOrderSpiralTraversal(Node root,int height){
        boolean flag=false;
        for (int i=1;i<=height;i++){
            flag=!flag;
            printTheGivenNode(root,i,flag);
        }
    }

    public void printTheGivenNode(Node root,int level,boolean spiral){
        if (root==null){
            return;
        }
        if(level==1){
            System.out.print(root.key+",");
        }else if(spiral){
            printTheGivenNode(root.right,level-1,spiral);
            printTheGivenNode(root.left,level-1,spiral);
        }else{
            printTheGivenNode(root.left,level-1,spiral);
            printTheGivenNode(root.right,level-1,spiral);
        }
    }
}
