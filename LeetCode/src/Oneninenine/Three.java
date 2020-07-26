package Oneninenine;

import java.util.LinkedList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
         this.right = right;
     }
 }

public class Three {
    int res=0;
    public class ResNode {
        int res;
        int[] distanceList;
        ResNode() {
            distanceList = new int[100];
            res = 0;
            for(int i=0;i<100;i++) {
                distanceList[i] = 0;
            }
        }
    }
    private ResNode countPairsInternal(TreeNode root, int distance) {
        ResNode res = new ResNode();
        if(root.left== null && root.right == null) {
            res.distanceList[0] +=1;
            return res;
        }
        ResNode left = new ResNode();
        if(root.left!= null ) {
            left = countPairsInternal(root.left,distance);
        }
        ResNode right = new ResNode();
        if(root.right!= null ) {
            right = countPairsInternal(root.right,distance);
        }
        res.res = left.res + right.res;
        for(int i=0;i<99;i++) {
            res.distanceList[i+1] += left.distanceList[i];
            res.distanceList[i+1] += right.distanceList[i];
        }
        for(int i=0;i<100;i++) {
            if(i<=distance-2) {
                for(int j=0;j<=distance-2-i;j++) {
                    res.res += left.distanceList[i] * right.distanceList[j];
                }
            }
        }
        return res;
    }
    public int countPairs(TreeNode root, int distance) {
        return countPairsInternal(root,distance).res;
    }

    public int countPairs1(TreeNode root, int distance) {
        res =0;
        dfs(root,distance);
        return res;
    }
    public List dfs(TreeNode root,int d)
    {
        if(root.left==null&&root.right==null)
        {   List a = new LinkedList();
            a.add(0);
            return a;
        }
        List<Integer> left=null,right=null;
        if(root.left!=null)
        {
            left = dfs(root.left,d);
        }
        if(root.right!=null)
        {
            right = dfs(root.right,d);
        }
        if(left!=null)
        {
            for (int i = 0; i <left.size() ; i++) {
                left.set(i,left.get(i)+1);
            }
        }
        if(right!=null)
        {
            for (int i = 0; i <right.size() ; i++) {
                right.set(i,right.get(i)+1);
            }
        }
        if(left!=null&&right!=null)
        {
            for (Integer integer : left) {
                for (Integer integer1 : right) {
                    if(integer1+integer<=d)
                    {
                        res+=1;
                    }
                }
            }
            left.addAll(right);
        }



        return  left==null?right:left;
    }



    }



