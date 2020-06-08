package Tree;

public class InorderSuccessor {
    ThreadedBinaryTreeNode InorderSuccessor(ThreadedBinaryTreeNode P)
    {
        ThreadedBinaryTreeNode Position;
        if(P.getRtag()==0)
        {
            return P.getRight();
        }
        else
        {
            P = P.getRight();
            while (P.getLtag()==1)
            {
                P=P.getLeft();
            }
            return P;
        }
    }
}
