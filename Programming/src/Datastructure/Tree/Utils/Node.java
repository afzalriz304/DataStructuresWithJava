package Datastructure.Tree.Utils;

public class Node {
    public int key;
    public Node left;
    public Node right;

    public static void main(String[] args) {
        Node node=new Node();
        node.addNodesToTree();
    }

    public void addNodesToTree(){
        Node root=new Node();
        root.key=1;

        Node l0=new Node();
        l0.left.key=2;

        Node r0=new Node();
        r0.right.key=3;

        root.left=l0;
        root.right=r0;


        Node l0l1=new Node();
        l0l1.left.key=4;

        Node l0r1=new Node();
        l0r1.right.key=5;

        l0.left=l0l1;
        l0.right=l0r1;


        Node r0l1= new Node();
        r0l1.key=6;

        Node r0r1=new Node();
        r0r1.key=7;

        r0.left=r0l1;
        r0.right=r0r1;

        /*
        * ---------------1
        * -------------/---\
        * -----------2------3
        * ----------/-\-----/-\
        * --------4----5---6---7
        *
        * */
    }
}
