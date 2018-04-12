import java.util.Arrays;


/**
 * @author Lika
 * @date 2018/04/12 19:42
 * Description:重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * <p>
 * int[] 转 List<Integer>
 * Arrays.stream(ints).boxed().collect(Collectors.toList());
 * List<Integer> 转 int[]
 * list.stream().mapToInt(i->i).toArray();
 * <p>
 * copyOfRange
 * from参数包含
 * to 不包含
 * <p>
 * 前序和中序的数目总是相同的
 */
public class reConstructBinaryTree4 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
            }
        }
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //TODO 前序、中序、后序遍历。递归与非递归实现
}

