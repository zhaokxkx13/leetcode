/*************************************************************************
    > File Name: leetcode/SymmetricTree.java
    > Author: zhaokxkx13
    > Mail: zhaoguochen01@gmal.com
    > Created Time: 2018年03月19日 星期一 20时49分43秒
 ************************************************************************/
class Solution{
	public boolean isSymmetric(TreeNode root){
		if(root == null){
			return true;
		}
		return isEqual(root.left,root.right);
	}

	public boolean isEqual(TreeNode left,TreeNode right){
		if(left == null && right == null){
			return true;
		}
		if(left == null || right == null){
			return false;
		}
		if(left.val != right.val){
			return false;
		}

		return isEqual(left.left,right.right) && isEqual(left.right,right.left);
	}
}
