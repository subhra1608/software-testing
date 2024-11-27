package dsa.solutions.walmart.Tree;

import java.util.HashMap;
import java.util.Map;

public class TreeBuilder {
    private Map<Integer, Integer> inorderIndexMap;
    private int preorderIndex;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorderIndex = 0;
        this.inorderIndexMap = new HashMap<>();

        // Map inorder values to their indices for quick access
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        return constructTree(preorder, 0, inorder.length - 1);
    }

    private TreeNode constructTree(int[] preorder, int left, int right) {
        // Base case: if the left index exceeds the right index, return null
        if (left > right) {
            return null;
        }

        // Get the current root value from the preorder array
        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);

        // Recursively build the left and right subtrees
        root.left = constructTree(preorder, left, inorderIndexMap.get(rootValue) - 1);
        root.right = constructTree(preorder, inorderIndexMap.get(rootValue) + 1, right);

        return root;
    }
}
