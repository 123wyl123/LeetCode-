package Seven;

import java.util.PriorityQueue;

public class SixtySeven {
    public String reorganizeString(String S) {
        char[] chars = S.toCharArray();
        int length = S.length();
        int a[] = new int[26];
        for (char aChar : chars) {
            a[aChar-'a']++;
        }
        PriorityQueue<Node> nodes = new PriorityQueue<>((Node aa, Node bb) ->
        {
            return bb.Que - aa.Que;
        });
        for (int i = 0; i <26 ; i++) {
            if (a[i]==0)
            {
                continue;
            }else
            {
                nodes.add(new Node((char)(i+'a'),a[i]));
            }
        }
        Node poll = nodes.poll();
        StringBuffer stringBuffer = new StringBuffer();
        while (!nodes.isEmpty())
        {
            Node poll1 = nodes.poll();
            while (poll.Que>0&&poll1.Que>0)
            {
                poll.Que--;
                poll1.Que--;
                if (stringBuffer.length()==0||stringBuffer.charAt(stringBuffer.length()-1)!=poll.a)
                {

                    stringBuffer.append(poll.a);
                    stringBuffer.append(poll1.a);
                }else
                {
                    stringBuffer.append(poll1.a);
                    stringBuffer.append(poll.a);
                }
            if (!nodes.isEmpty()&&poll.Que<nodes.peek().Que)
            {
                nodes.add(poll);
                poll = nodes.poll();
            }else if(!nodes.isEmpty()&&poll1.Que<nodes.peek().Que)
            {
                nodes.add(poll1);
                poll1 = nodes.poll();
            }
            }
            if (poll1.Que==0&&poll.Que==0)
            {   if (!nodes.isEmpty())
            {
                poll=nodes.poll();
            }

            }else if (poll1.Que==0)
            {
            continue;
            }else
            {
                poll=poll1;
            }
        }
            if (poll.Que==1)
            {   stringBuffer.append(poll.a);

            }else if (poll.Que>1)
            {
                return "";
            }
            return stringBuffer.toString();
    }

    public static void main(String[] args) {
        new SixtySeven().reorganizeString("tndsewnllhrtwsvxenkscbivijfqnysamckzoyfnapuotmdexzkkrpmppttficzerdndssuveompqkemtbwbodrhwsfpbmkafpwyedpcowruntvymxtyyejqtajkcjakghtdwmuygecjncxzcxezgecrxonnszmqmecgvqqkdagvaaucewelchsmebikscciegzoiamovdojrmmwgbxeygibxxltemfgpogjkhobmhwquizuwvhfaiavsxhiknysdghcawcrphaykyashchyomklvghkyabxatmrkmrfsppfhgrwywtlxebgzmevefcqquvhvgounldxkdzndwybxhtycmlybhaaqvodntsvfhwcuhvuccwcsxelafyzushjhfyklvghpfvknprfouevsxmcuhiiiewcluehpmzrjzffnrptwbuhnyahrbzqvirvmffbxvrmynfcnupnukayjghpusewdwrbkhvjnveuiionefmnfxao");
    }
    class Node
    {
        char a;
        int Que;
        Node (char a,int Que)
        {
            this.a = a;
            this.Que = Que;
        }
    }
}
