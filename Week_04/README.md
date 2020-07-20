# DFS代码模版 递归写法 vs DFS代码模版 递归写法

      public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> allResults = new ArrayList<>();
        if(root==null){
            return allResults;
        }
        travel(root,0,allResults);
        return allResults;
    }


    private void travel(TreeNode root,int level,List<List<Integer>> results){
        if(results.size()==level){
            results.add(new ArrayList<>());
        }
        results.get(level).add(root.val);
        if(root.left!=null){
            travel(root.left,level+1,results);
        }
        if(root.right!=null){
            travel(root.right,level+1,results);
        }
    }
# DFS代码模版 递归写法
    #Python
	def DFS(self, tree): 

	if tree.root is None: 
		return [] 

	visited, stack = [], [tree.root]

	while stack: 
		node = stack.pop() 
		visited.add(node)

		process (node) 
		nodes = generate_related_nodes(node) 
		stack.push(nodes) 

	# other processing work 
	...    
	
	
* 二叉树的层序遍历（字节跳动、亚马逊、微软在半年内面试中考过）
* 最小基因变化
* 括号生成（字节跳动、亚马逊、Facebook 在半年内面试中考过）
* 在每个树行中找最大值（微软、亚马逊、Facebook 在半年内面试中考过）
* 单词接龙（亚马逊在半年内面试常考）
* 单词接龙 II （微软、亚马逊、Facebook 在半年内面试中考过）
* 岛屿数量（近半年内，亚马逊在面试中考查此题达到 350 次）
* 扫雷游戏
*  柠檬水找零（亚马逊在半年内面试中考过）
*  买卖股票的最佳时机 II （亚马逊、字节跳动、微软在半年内面试中考过）
*  分发饼干（亚马逊在半年内面试中考过）
*  模拟行走机器人
*  跳跃游戏 （亚马逊、华为、Facebook 在半年内面试中考过）
*  跳跃游戏 II （亚马逊、华为、字节跳动在半年内面试中考过）
	
	
#BFS 代码模板	
    //Java
	public class TreeNode {
   		int val;
    	TreeNode left;
    	TreeNode right;

    	TreeNode(int x) {
        	val = x;
    	}
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> allResults = new ArrayList<>();
    	if (root == null) {
        	return allResults;
    	}
    	
    	Queue<TreeNode> nodes = new LinkedList<>();
    
    	nodes.add(root);
    	
    	while (!nodes.isEmpty()) {
        int size = nodes.size();
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            TreeNode node = nodes.poll();
            results.add(node.val);
            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }
        allResults.add(results);
       }

       return allResults;
	}
# 二分查找代码模版
    // Java
	public int binarySearch(int[] array, int target) {
  	  	int left = 0, right = array.length - 1, mid;
 	   	while (left <= right) {
       		mid = (right - left) / 2 + left;
        		if (array[mid] == target) {
            			return mid;
        		} else if (array[mid] > target) {
           			right = mid - 1;
        		} else {
            			left = mid + 1;
        		}
    		}
 		return -1;
	}	
	
	
* x 的平方根（字节跳动、微软、亚马逊在半年内面试中考过）
* 有效的完全平方数（亚马逊在半年内面试中考过）
* 搜索旋转排序数组（Facebook、字节跳动、亚马逊在半年内面试常考）
* 搜索二维矩阵（亚马逊、微软、Facebook 在半年内面试中考过）
* 寻找旋转排序数组中的最小值（亚马逊、微软、字节跳动在半年内面试中考过）
* 使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方
说明：同学们可以将自己的思路、代码写在学习总结中


	
#分治代码模版

    def divide_conquer(problem, param1, param2, ...): 
    	 # recursion terminator 
  	 if problem is None: 
		print_result 
		return 

 	 # prepare data 
  		data = prepare_data(problem) 
 		 subproblems = split_problem(problem, data) 

  	 # conquer subproblems 
  		subresult1 = self.divide_conquer(subproblems[0], p1, ...) 
  		subresult2 = self.divide_conquer(subproblems[1], p1, ...) 
  		subresult3 = self.divide_conquer(subproblems[2], p1, ...) 
  		…

  	# process and generate the final result 
  		result = process_result(subresult1, subresult2, subresult3, …)
	
 	 # revert the current level states		
 * 括号生成	 
 * Pow(x, n) 
 * 子集
 * 多数元素 （亚马逊、字节跳动、Facebook 在半年内面试中考过）
 * 电话号码的字母组合（亚马逊在半年内面试常考）
 * N 皇后
 * 二叉树的最近公共祖先（Facebook 在半年内面试常考）
* 从前序与中序遍历序列构造二叉树（字节跳动、亚马逊、微软在半年内面试中考过）
* 组合（微软、亚马逊、谷歌在半年内面试中考过）
* 全排列（字节跳动在半年内面试常考）
* 全排列 II （亚马逊、字节跳动、Facebook 在半年内面试中考过）
* 二叉树的层次遍历
* 分发饼干
* 买卖股票的最佳时机 II
* 跳跃游戏
* x 的平方根
* 有效的完全平方数 	 

#递归代码模版
      // Java
	    public void recur(int level, int param) { 
  			// terminator 
  			if (level > MAX_LEVEL) { 
    			 // process result 
    			return; 
  			}
    		// process current logic 
     		process(level, param); 
     
    		// drill down 
    
    		recur( level: level + 1, newParam); 
    
    		// restore current status 
    }	 	
    
* 爬楼梯
* 斐波那契数列    
* 括号生成 (字节跳动在半年内面试中考过)
* 翻转二叉树 (谷歌、字节跳动、Facebook 在半年内面试中考过)
* 验证二叉搜索树（亚马逊、微软、Facebook 在半年内面试中考过）
* 二叉树的最大深度（亚马逊、微软、字节跳动在半年内面试中考过）
* 二叉树的最小深度（Facebook、字节跳动、谷歌在半年内面试中考过）
* 二叉树的序列化与反序列化（Facebook、亚马逊在半年内面试常考）
* 二叉树的最近公共祖先（Facebook 在半年内面试常考）
* 从前序与中序遍历序列构造二叉树（字节跳动、亚马逊、微软在半年内面试中考过）
* 组合（微软、亚马逊、谷歌在半年内面试中考过）
* 全排列（字节跳动在半年内面试常考）
* 全排列 II （亚马逊、字节跳动、Facebook 在半年内面试中考过）
	
	