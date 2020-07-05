package 遍历;

import java.util.ArrayList;
import java.util.List;

public class N叉树的前序遍历 {
    public List<Integer> preorder(Node root) {

        ArrayList<Integer> res = new ArrayList<>();

        traversal(res,root);

        return res;
    }

    private void traversal(ArrayList<Integer> res, Node root) {
        if (root != null){

            res.add(root.val);
            root.children.forEach(child -> {
                traversal(res,child);
            });

        }

    }
}
