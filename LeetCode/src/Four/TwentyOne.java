package Four;

class Node1 {
    public Node1[] nexts = new Node1[2];
}

class NumTrie {
    // 头节点
    public Node1 head = new Node1();

    // 把某个数字newNum加入到这棵前缀树里
    // num是一个32位的整数，所以加入的过程一共走32步
    public void add(int newNum) {
        Node1 cur = head;
        for (int move = 31; move >= 0; move--) {
            // 从高位到低位，取出每一位的状态，如果当前状态是0，
            // path(int) = 0
            // ，如果当前状态是1
            // path(int) = 1
            int path = ((newNum >> move) & 1);
            // 无路新建、有路复用
            cur.nexts[path] = cur.nexts[path] == null ? new Node1() : cur.nexts[path];
            cur = cur.nexts[path];
        }
    }

    public int maxXor(int sum) {
        Node1 cur = head;
        int res = 0;
        for (int move = 31; move >= 0; move--) {
            int path = (sum >> move) & 1;
            // 期待的路
            int best = move == 31 ? path : (path ^ 1);
            // 实际走的路
            best = cur.nexts[best] != null ? best : (best ^ 1);
            // (path ^ best) 当前位位异或完的结果
            res |= (path ^ best) << move;
            cur = cur.nexts[best];
        }
        return res;
    }
}

public class TwentyOne {
    public int findMaximumXOR(int[] nums) {
        if (nums==null||nums.length==0||nums.length==1)
        {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int eor = 0;
        NumTrie numTrie = new NumTrie();
        numTrie.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, numTrie.maxXor(nums[i]));
            numTrie.add(nums[i]);
        }
        return max;
    }

}
