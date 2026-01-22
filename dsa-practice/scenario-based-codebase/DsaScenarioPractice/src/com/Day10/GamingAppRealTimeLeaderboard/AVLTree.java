package com.Day10.GamingAppRealTimeLeaderboard;

public class AVLTree {

    PlayerNode root;

    int height(PlayerNode n) {
        return (n == null) ? 0 : n.height;
    }

    int getBalance(PlayerNode n) {
        return (n == null) ? 0 : height(n.left) - height(n.right);
    }

    PlayerNode rightRotate(PlayerNode y) {
        PlayerNode x = y.left;
        PlayerNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    PlayerNode leftRotate(PlayerNode x) {
        PlayerNode y = x.right;
        PlayerNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    PlayerNode insert(PlayerNode node, String name, int score) {

        if (node == null)
            return new PlayerNode(name, score);

        if (score < node.score)
            node.left = insert(node.left, name, score);
        else
            node.right = insert(node.right, name, score);

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // LL Case
        if (balance > 1 && score < node.left.score)
            return rightRotate(node);

        // RR Case
        if (balance < -1 && score > node.right.score)
            return leftRotate(node);

        // LR Case
        if (balance > 1 && score > node.left.score) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL Case
        if (balance < -1 && score < node.right.score) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void addPlayer(String name, int score) {
        root = insert(root, name, score);
    }

    PlayerNode minValueNode(PlayerNode node) {
        PlayerNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    PlayerNode delete(PlayerNode root, int score) {

        if (root == null)
            return root;

        if (score < root.score)
            root.left = delete(root.left, score);
        else if (score > root.score)
            root.right = delete(root.right, score);
        else {

            if ((root.left == null) || (root.right == null)) {

                PlayerNode temp = null;
                if (root.left != null)
                    temp = root.left;
                else
                    temp = root.right;

                if (temp == null)
                    root = null;
                else
                    root = temp;
            } else {
                PlayerNode temp = minValueNode(root.right);
                root.name = temp.name;
                root.score = temp.score;
                root.right = delete(root.right, temp.score);
            }
        }

        if (root == null)
            return root;

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = getBalance(root);

        // LL
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        // LR
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // RR
        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        // RL
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public void removePlayer(int score) {
        root = delete(root, score);
    }

    public void showTop10() {
        int[] count = { 0 };
        System.out.println("\n🏆 TOP 10 PLAYERS");
        reverseInorder(root, count);
    }

    void reverseInorder(PlayerNode node, int[] count) {
        if (node == null || count[0] >= 10)
            return;

        reverseInorder(node.right, count);

        if (count[0] < 10) {
            System.out.println((count[0] + 1) + ". " + node.name + " → " + node.score);
            count[0]++;
        }

        reverseInorder(node.left, count);
    }
}
