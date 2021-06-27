package FiftyFive;

import java.util.*;

public class MovieRentingSystem {
    HashMap <Integer,TreeSet<Node>>aa= new HashMap<Integer, TreeSet<Node>>();
    PriorityQueue<Node> nodes12 = new PriorityQueue<>(new Comparator<Node>() {
        @Override
        public int compare(Node o1, Node o2) {
            if (o1.price == o2.price) {
                if (o1.shop == o2.shop) {
                    return o1.movie - o2.movie;
                } else {
                    return o1.shop - o2.shop;
                }
            } else {
                return o1.price - o2.price;
            }
        }
    });
   HashMap<Integer,Node> a;
    public MovieRentingSystem(int n, int[][] entries) {

        a=new HashMap<>();
        for (int[] entry : entries) {
            int shop = entry[0];
            int movie = entry[1];
            int price = entry[2];
            a.put(movie,new Node(shop,price,0,movie));
            if (aa.containsKey(movie))
            {
                TreeSet<Node> nodes = aa.get(movie);
                nodes.add(new Node(shop,price,0,movie));
                aa.put(movie,nodes);
            }else
            {
                TreeSet<Node> nodes = new TreeSet<>(new Comparator<Node>() {
                    @Override
                    public int compare(Node o1, Node o2) {
                        if (o1.rent == o2.rent) {
                            if (o1.price - o2.price == 0) {
                                return o1.shop - o2.shop;
                            } else {
                                return o1.price - o2.price;
                            }
                        } else {
                            return o1.rent - o2.rent;
                        }
                    }
                });
                nodes.add(new Node(shop,price,0,movie));
                aa.put(movie,nodes);
            }
        }
    }

    public List<Integer> search(int movie) {
        TreeSet<Node> nodes;
        if (aa.containsKey(movie))
        {
           nodes= aa.get(movie);
        }else
        {
            return new LinkedList<>();
        }


        LinkedList<Node> nodes1 = new LinkedList<>();
        for (int i = 0; i <5 ; i++) {
            if (nodes.size()!=0)
            {
                Node node = nodes.pollFirst();
                nodes1.addLast(node);
            }

        }
        for (Node node : nodes1) {
            nodes.add(node);
        }
        LinkedList<Integer> nodes2 = new LinkedList<>();
        while (nodes1.size()!=0)
        {
            Node node = nodes1.removeFirst();
            nodes2.addLast(node.shop);
        }

        return nodes2;
    }

    public void rent(int shop, int movie) {
        Node node1 = a.get(movie);
        nodes12.add(new Node(shop,node1.price,1,movie));
        TreeSet<Node> nodes = aa.get(movie);
        Node a= new Node(1,1,1,1);
        for (Node node : nodes) {
            if (node.shop==shop)
            {
                nodes.remove(node);
                a=node;
                break;
            }
        }
        nodes.add(new Node(shop,a.price,1,a.movie));
        aa.put(movie,nodes);

    }

    public void drop(int shop, int movie) {
        LinkedList<Node> nodess = new LinkedList<>();
        while (nodes12.size()!=0)
    {
        Node poll = nodes12.poll();
        if (poll.movie==movie&&poll.shop==shop)
        {poll.rent=0;
            break;
        }else
        {
            nodess.addLast(poll);
        }
    }
        for (Node node : nodess) {
            nodes12.add(node);
        }
        TreeSet<Node> nodes = aa.get(movie);
        for (Node node : nodes) {
            if (node.shop==shop&&node.movie==movie)
            {   node.rent=0;
                break;
            }
        }
    }

    public List<List<Integer>> report() {
        LinkedList<Node> nodess = new LinkedList<>();
        while (nodes12.size()!=0)
        {
            Node poll = nodes12.poll();
                nodess.addLast(poll);
            if (nodess.size()==5)
            {
                break;
            }
        }
        for (Node node : nodess) {
            nodes12.add(node);
        }
        LinkedList<List<Integer>> lists = new LinkedList<>();
        while (nodess.size()!=0)
        {
            Node node = nodess.removeFirst();
            LinkedList<Integer> integers = new LinkedList<>();
            integers.addLast(node.shop);
            integers.addLast(node.movie);
            lists.addLast(integers);
        }
        return lists;
    }
    class Node
    {
        int shop;
        int price;
        int rent ;
        int movie;
        Node (int shop,int price,int rent,int movie)
        {
            this.shop=shop;
            this.price=price;
            this.rent=rent;
            this.movie=movie;
        }
    }

}
