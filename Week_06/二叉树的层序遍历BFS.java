import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 二叉树的层序遍历BFS {
    public static void main(String[] args) {

    }



    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> resultLists = new ArrayList<>();
        if (root == null) return resultLists;

        Queue<TreeNode> nodes = new LinkedList<>();

        nodes.add(root);

        while (!(nodes.size() == 0)){
            ArrayList<Integer> levelList = new ArrayList<>();
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = nodes.poll();
                levelList.add(treeNode.val);
                if (treeNode.left != null){
                    nodes.add(treeNode.left);
                }
                if (treeNode.right != null){
                    nodes.add(treeNode.right);
                }
            }
            resultLists.add(levelList);
        }

        return resultLists;

    }




}
