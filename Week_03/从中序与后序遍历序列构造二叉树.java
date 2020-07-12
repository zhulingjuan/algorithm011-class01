import java.util.Arrays;

public class 从中序与后序遍历序列构造二叉树 {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null) {
            return null;
        }
        return buildTreeResolve(inorder,postorder);
    }

    private TreeNode buildTreeResolve(int[] in, int[] post) {
        if(in.length==0) {
            return null;
        }
        TreeNode root = new TreeNode(post[post.length-1]);
        for(int i=0;i<in.length;++i) {
            if(in[i]==post[post.length-1]) {
                int[] inLeft = Arrays.copyOfRange(in,0,i);
                int[] inRight = Arrays.copyOfRange(in,i+1,in.length);
                int[] postLeft = Arrays.copyOfRange(post,0,i);
                int[] postRight = Arrays.copyOfRange(post,i,post.length-1);
                root.left = buildTreeResolve(inLeft,postLeft);
                root.right = buildTreeResolve(inRight,postRight);
                break;
            }
        }
        return root;
    }


}



