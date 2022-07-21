package beakjoon.main_1991;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main { //트리 순회

    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] rootTree = br.readLine().split(" ");
        Node root = new Node(rootTree[0]);
        if (!rootTree[1].equals(".")) root.left = new Node(rootTree[1]);
        if (!rootTree[2].equals(".")) root.right = new Node(rootTree[2]);

        for (int i = 0; i < n - 1; i++) {
            String[] tree = br.readLine().split(" ");
            if (!tree[1].equals(".")) {
                root.insertLeft(tree[0], tree[1]);
            }
            if (!tree[2].equals(".")) {
                root.insertRight(tree[0], tree[2]);
            }
        }

        preOrder(root);
        sb.append("\n");
        inOrder(root);
        sb.append("\n");
        postOrder(root);
        bw.write(sb.toString());

        bw.close();
        br.close();
    }

    private static void postOrder(Node root) {
        if (root.left != null) postOrder(root.left);
        if (root.right != null) postOrder(root.right);
        sb.append(root.value);
    }

    private static void preOrder(Node root) {
        sb.append(root.value);
        if (root.left != null) preOrder(root.left);
        if (root.right != null) preOrder(root.right);
    }

    private static void inOrder(Node root) {
        if (root.left != null) inOrder(root.left);
        sb.append(root.value);
        if (root.right != null) inOrder(root.right);
    }

}

class Node {

    String value;
    Node left;
    Node right;

    public Node(String value) {
        this.value = value;
    }

    void insertLeft(String root, String child) {
        if (this.value.equals(root)) {
            this.left = new Node(child);
        } else {
            if (this.left != null) {
                this.left.insertLeft(root, child);
            }
            if (this.right != null) {
                this.right.insertLeft(root, child);
            }
        }
    }

    void insertRight(String root, String child) {
        if (this.value.equals(root)) {
            this.right = new Node(child);
        } else {
            if (this.right != null) {
                this.right.insertRight(root, child);
            }
            if (this.left != null) {
                this.left.insertRight(root, child);
            }
        }
    }

}
