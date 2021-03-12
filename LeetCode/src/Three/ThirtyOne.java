package Three;

import java.util.Deque;
import java.util.LinkedList;

public class ThirtyOne {
    class Node
    {
        public Node(int val)
        {
            this.val = val;
        }
        int val;
        Node left;
        Node right;
    }
    public boolean isValidSerialization(String preorder) {
        char[] chars = preorder.toCharArray();
        if (preorder.length()==0)
        {
            return true;
        }
        Deque<Node> a =new LinkedList<>();
        int i=0;
     while (i<chars.length){
            if (chars[i]==',')
            {   i++;
                continue;
            }
            if (a.isEmpty())
            {   if (chars[i]=='#')
            {
             if (i==chars.length-1)
             {  i++;
                 continue;
             }else
             {
                 return false;
             }
            }
            if (i!=0)
            {
                return false;
            }
                int temp =0;
                int j=0;
                for ( j= i; j <chars.length ; j++) {
                    if (Character.isDigit(chars[j]))
                    {
                        temp=temp*10+chars[j]-'0';
                    }else
                    {
                        break;
                    }
                }
                i=j;
                Node node = new Node(temp);
                a.push(node);
            }else
            {   int temp =0;
                int j=0;
                if (chars[i]!='#')
                {
                    for ( j= i; j <chars.length ; j++) {
                        if (Character.isDigit(chars[j]))
                        {
                            temp=temp*10+chars[j]-'0';
                        }else {
                            break;
                        }
                    }
                    i=j;
                }else
                {

                }


                Node node = new Node(temp);
                if (a.peek().left==null)
                {
                    a.peek().left=node;
                }else if (a.peek().right==null)
                {
                    a.peek().right=node;
                    a.pop();
                }else
                {
                    return false;
                }
                if (i<chars.length&&chars[i]=='#')
                {   i++;
                    continue;
                }else
                {
                    a.push(node);
                }
            }
        }
        return a.isEmpty()?true:false;
    }

    public static void main(String[] args) {
        boolean validSerialization = new ThirtyOne().isValidSerialization("9,3,4,#,#,1,#,#,#,2,#,6,#,#");
        System.out.println(validSerialization);
    }
}
