/*************************************************************************
    > File Name: PathSum.java
    > Author: zhaokxkx13
    > Mail: zhaoguochen01@gmal.com
    > Created Time: 2018年03月19日 星期一 21时47分46秒
 ************************************************************************/
class Solution{
	public boolean hasPathSum(TreeNode root,int sum){
		if(root==null){
			return false;
		}
		return equalPathSum(root,0,sum);	
	}

	public boolean equalPathSum(TreeNode root,int sumNow,int goal){
		if(root == null){
			return false;
		}
		if(root.left == null && root.right == null){
			if(sumNow+root.val == goal){
				return true;
			} else{
				return false;
			}
		}
			return equalPathSum(root.left,sumNow+root.val,goal) || equalPathSum(root.right,sumNow+root.val,goal); 
		
	}
}
