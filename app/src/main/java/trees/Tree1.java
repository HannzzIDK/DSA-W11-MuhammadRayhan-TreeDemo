package trees;

import java.util.ArrayList;
import java.util.List;

public class Tree1 {

    class Node {
        int data;
        List<Node> children;

        Node(int x) {
            data = x;
            children = new ArrayList<>();
        }
    }

    public void printLeaf(Node node) {
        if (node == null) {
            return;
        }
        if (node.children.isEmpty()) {
            System.out.print(node.data + " ");
        }
        for (Node child : node.children) {
            printLeaf(child);
        }
    }

    public static void main(String[] args) {
        Tree1 t = new Tree1();
        Node root = t.new Node(10);
        Node child1 = t.new Node(20);
        Node child2 = t.new Node(30);
        Node child3 = t.new Node(40);
        Node child4 = t.new Node(67);
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);
        child3.children.add(child4);
        t.printLeaf(root);
    }

}