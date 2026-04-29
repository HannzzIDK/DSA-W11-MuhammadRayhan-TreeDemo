package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tree2 {

    class Node {
        int data;
        List<Node> children;

        Node(int x) {
            data = x;
            children = new ArrayList<>();
        }
    }

    public void printNodeAtSpecificLevel(Node node, int level) {
        if (node == null) {
            return;
        }
        if (level == 1) {
            System.out.print(node.data + " ");
        }
        for (Node child : node.children) {
            printNodeAtSpecificLevel(child, level - 1);
        }

    }

    public static void main(String[] args) {
        Tree2 t = new Tree2();
        Node root = t.new Node(10);
        Node child1 = t.new Node(20);
        Node child2 = t.new Node(30);
        Node child3 = t.new Node(40);
        Node child4 = t.new Node(67);
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);
        child3.children.add(child4);

        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();
        t.printNodeAtSpecificLevel(root, level);
        sc.close();
    }
}