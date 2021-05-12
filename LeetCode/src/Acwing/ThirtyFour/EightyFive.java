package Acwing.ThirtyFour;

import java.util.Scanner;

public class EightyFive {
    static int n , m ;
    static int [] a ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        a = new int[n];
        int [] sum = new int[n+1];
        for (int i = 0; i <n ; i++) {
            a[i]=scanner.nextInt();
        }
        for (int i = 1; i <=n ; i++) {
            sum[i]=sum[i-1]^a[i-1];
        }
        int j=1;
        Trie trie = new Trie() ;
        trie.add(0);
        int max = 0 ;
        for (int i = 1; i <=n ; i++) {
            while (i-j>m)
            {
            trie.remove(sum[j]);
            j++;
            }
            if (i==m+1)
            {
                trie.remove(0);
            }
            trie.add(sum[i]) ;
            max = Math.max(max, trie.get(sum[i])) ;
        }
        System.out.println(max);
    }
    static class Node {
        Node [] sub = new Node[2] ;
        int cnt ;
    }
    static class Trie {

        Node root ;
        Trie (){
            root = new Node();
        }
        public void add (int x){
            Node cur = root ;
            for (int i = 30 ; i >= 0 ; --i) {
                int d = (x >> i) & 1 ;
                if (cur.sub[d] == null) {
                    cur.sub[d] = new Node ();
                }
                cur = cur.sub[d];
                cur.cnt++;
            }
        }
        void remove(int x)
        {
            Node cur = root;
            for (int i = 30; i >=0 ; i--) {
                int d = x>>i&1;
                cur.sub[d].cnt--;
                cur = cur.sub[d];
            }
        }
       public int get(int x){
            int sum = 0 ;
            Node cur = root ;
            for (int i = 30 ; i >= 0 ; -- i) {
                int d = (x >> i) & 1 ;
                if (cur.sub[d ^ 1] != null && cur.sub[d ^ 1].cnt > 0) {
                    sum = sum * 2 + 1 ;
                    cur = cur.sub[d ^ 1] ;
                } else if (cur.sub[d] != null && cur.sub[d].cnt > 0){
                    sum = sum * 2 ;
                    cur = cur.sub[d] ;
                }
            }
            return sum ;
        }


    }

}
