import java.util.ArrayList;
import java.util.List;

public class 二叉树的层序遍历 {
    public static void main(String[] args) {

    }



    public List<List<Integer>> levelOrder(TreeNode root) {
        //构造返回结果
        List<List<Integer>> resultLists = new ArrayList<>();
        //如果二叉树为null，直接返回
        if (root == null) return resultLists;

        travel(root,0,resultLists);

        return resultLists;
    }

    private void travel(TreeNode root, int level, List<List<Integer>> resultLists) {
        //level 从0 开始，resultlists.size 从1 开始。如果可以走到这个方法，说明他的父节点已经在result中已经占有一席之地了，不会出现size 小于 level的情况。
        if (resultLists.size() == level) {
            resultLists.add(new ArrayList<>());
        }

        resultLists.get(level).add(root.val);

        if (root.left != null){
            travel(root.left,level+1,resultLists);
        }

        if (root.right != null){
            travel(root.right,level+1,resultLists);
        }


    }


}
