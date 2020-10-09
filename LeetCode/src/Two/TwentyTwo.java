package Two;

public class TwentyTwo {
    public int countNodes(TreeNode root) {
            if (root==null)
            {
                return 0;
            }
        return bs(root,1,mostLeftLevel(root,1));
    }
    public int bs(TreeNode node ,int level,int h)
    {
        if (level==h)
        {
            return 1;
        }
        if (mostLeftLevel(node.right,level+1)==h)
        {
            return (1<<(h-level))+bs(node.right,level+1,h);
        }else
        {
            return (1<<(h-level-1))+bs(node.left,level+1,h);
        }

    }
    public int mostLeftLevel(TreeNode node ,int level)
    {
        while (node!=null)
        {
            level++;
            node=node.left;
        }
        return level-1;
    }
}

