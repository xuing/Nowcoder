import java.util.HashMap;

/**
 * @author Lika
 * @date 2019/01/26 14:27
 * Description:
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 要注意B树提前结束，也是属于子树的范畴...这道题用递归也不难，root1和root2打混了，导致调试了很久..没找到错误。所以说变量名还是应该起的有意义一些。
 */
public class HasSubtree17 {
    public static boolean isSame(TreeNode root1, TreeNode root2) {
        if (root1 != null && root2 != null) {
            return root1.val == root2.val && isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
        } else if (root1 == null && root2 == null) {
            return true;
        }
        return root1 != null;
    }

    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return isSame(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    public static void main(String[] args) {
        TreeNode root2 = new TreeNode(8);
        root2.left = new TreeNode(9);
        root2.right = new TreeNode(2);

        TreeNode root1 = new TreeNode(8);
        root1.left = new TreeNode(8);
        root1.left.left = new TreeNode(9);
        root1.left.right = new TreeNode(2);
        root1.left.right.left = new TreeNode(4);

        System.out.println(HasSubtree(root1, root2));

    }

    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
