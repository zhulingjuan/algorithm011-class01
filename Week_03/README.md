# 题目：
* https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
* https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
* https://leetcode-cn.com/problems/combinations/
* https://leetcode-cn.com/problems/permutations/
* https://leetcode-cn.com/problems/permutations-ii/
* https://leetcode-cn.com/problems/majority-element/description/
* https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
* https://leetcode-cn.com/problems/n-queens/

# 递归模版： 

* 终结逻辑 recursion terminator
* 当前层逻辑 process logic in current level
* 下探到下一层，drill down
* 清扫当前层状态 reverse the current level status if needed

# 递归注意点
* 不要人肉递归
* 找到最近最简方法，将其拆解成可重复解决的问题（重复子问题）
* 数学归纳法