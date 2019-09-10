package leetcode;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

/*
 * 二叉树的最大深度
 */
public class TreeNode01 {
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		else {
			int leftDep = maxDepth(root.left);
			int rightDep = maxDepth(root.right);
			return Math.max(leftDep, rightDep) + 1;
		}
	}
}
