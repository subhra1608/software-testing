package dsa.solutions.walmart.Tree;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class TreeBuilderTest {

    @Test
    void testTreeConstruction() {
        TreeBuilder builder = new TreeBuilder();

        // Test data
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        // Build tree
        TreeNode root = builder.buildTree(preorder, inorder);

        // Validate traversals
        assertEquals(Arrays.asList(9, 3, 15, 20, 7), BinaryTreeUtils.inorderTraversal(root));
        assertEquals(Arrays.asList(3, 9, 20, 15, 7), BinaryTreeUtils.preorderTraversal(root));
    }
}
