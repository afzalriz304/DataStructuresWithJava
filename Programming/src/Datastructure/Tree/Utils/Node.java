package Datastructure.Tree.Utils;

public class Node {
    public int key;
    public Node left;
    public Node right;

    public static void main(String[] args) {
        Node node = new Node();
        Node root = node.addNodesToTree();
        System.out.println("Pre-order traversal");
        node.preOrderTravel(root);

        System.out.println();
        System.out.println("Post-order traversal");
        node.postOrderTravel(root);

        System.out.println();
        System.out.println("in-order traversal");
        node.inOrderTravel(root);

        System.out.println();
        System.out.println("height of tree " + node.heightOfTree(root));

        System.out.println();
        System.out.println("in-order traversal");
        node.levelOrderTraversal(root);
    }

    public Node addNodesToTree() {
        Node root = new Node();
        root.key = 1;

        Node l0 = new Node();
        l0.key = 2;

        Node r0 = new Node();
        r0.key = 3;

        root.left = l0;
        root.right = r0;


        Node l0l1 = new Node();
        l0l1.key = 4;

        Node l0r1 = new Node();
        l0r1.key = 5;

        l0.left = l0l1;
        l0.right = l0r1;


        Node r0l1 = new Node();
        r0l1.key = 6;

        Node r0r1 = new Node();
        r0r1.key = 7;

        r0.left = r0l1;
        r0.right = r0r1;


        Node l0l1l2 = new Node();
        l0l1l2.key = 8;
        Node l0l1r2 = new Node();
        l0l1r2.key = 9;

        l0l1.left = l0l1l2;
        l0r1.right = l0l1r2;


        /*
         * -----------------1
         * -------------/------\
         * -----------2---------3
         * ---------/-\--------/-\
         * -------4----5-------6---7
         * -----/\----/--\----/\--/\
         *---- 8-9--null-null-null-null
         * */

        return root;
    }

    public void preOrderTravel(Node root) {
        if (root != null) {
            System.out.print(root.key + ",");
            preOrderTravel(root.left);
            preOrderTravel(root.right);
        }
    }

    public void postOrderTravel(Node root) {
        if (root != null) {
            postOrderTravel(root.left);
            postOrderTravel(root.right);
            System.out.print(root.key + ",");
        }
    }

    public void inOrderTravel(Node root) {
        if (root != null) {
            inOrderTravel(root.left);
            System.out.print(root.key + ",");
            inOrderTravel(root.right);
        }
    }

    public void levelOrderTraversal(Node root) {
        int height = heightOfTree(root);
        for (int i = 1; i <= height; i++) {
            givenLevelKey(root, i);
        }
    }

    /* to find the given root key*/
    public void givenLevelKey(Node root, int level) {
        if (root == null) {
           return;
        }
        else if (level == 1) {
            System.out.print(root.key + ",");
        } else {
            givenLevelKey(root.left, level - 1);
            givenLevelKey(root.right, level - 1);
        }
    }

    public int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        } else {
            int left = heightOfTree(root.left);
            int right = heightOfTree(root.right);
            if (left > right) {
                return left + 1;
            } else {
                return right + 1;
            }
        }
    }
}
