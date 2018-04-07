package co.zero.geekalgorithm.hackerrank.warmup;

/*
 *      Java Program to Implement suffix Tree
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class Node
 **/
class Node {
    public static int count = 1;
    public int suffix_node;

    /**
     * Constructor
     **/
    public Node() {
        suffix_node = -1;
    }
}

/**
 * Class suffix Tree
 **/
class SuffixTree {
    private static final int MAX_LENGTH = 1000;
    private static final int HASH_TABLE_SIZE = 2179;

    private char[] T = new char[MAX_LENGTH];
    private int N;
    private Edge[] edges;
    private Node[] nodes;
    private suffix active;

    /**
     * Constructor
     */
    public SuffixTree() {
        edges = new Edge[HASH_TABLE_SIZE];

        for (int i = 0; i < HASH_TABLE_SIZE; i++) {
            edges[i] = new Edge();
        }

        nodes = new Node[MAX_LENGTH * 2];

        for (int i = 0; i < MAX_LENGTH * 2; i++) {
            nodes[i] = new Node();
        }

        active = new suffix(0, 0, -1);
    }

    /**
     * Function hash() - edges are inserted into the hash table using this hashing function
     **/
    public static int hash(int node, int c) {
        return ((node << 8) + c) % HASH_TABLE_SIZE;
    }

    /**
     * Main Function
     **/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("suffix Tree Test\n");
        System.out.println("Enter string\n");
        String str = br.readLine();

        /** Construct suffix Tree **/
        SuffixTree st = new SuffixTree();
        st.T = str.toCharArray();
        st.N = st.T.length - 1;

        for (int i = 0; i <= st.N; i++)
            st.addPrefix(st.active, i);

        st.dump_edges(st.N);
    }

    /**
     * Function find() - function to find an edge
     **/
    public Edge find(int node, int c) {
        int i = hash(node, c);

        for (; ; ) {
            if (edges[i].start_node == node)
                if (c == T[edges[i].first_char_index])
                    return edges[i];
            if (edges[i].start_node == -1)
                return edges[i];

            i = ++i % HASH_TABLE_SIZE;
        }
    }

    /**
     * Function addPrefix() - called repetitively, once for each of the prefixes of the input string
     **/
    public void addPrefix(suffix active, int last_char_index) {
        int parent_node;
        int last_parent_node = -1;

        for (; ; ) {
            Edge edge;
            parent_node = active.origin_node;

            if (active.explicit()) {
                edge = find(active.origin_node, T[last_char_index]);
                if (edge.start_node != -1)
                    break;
            } else {
                edge = find(active.origin_node, T[active.first_char_index]);
                int span = active.last_char_index - active.first_char_index;
                if (T[edge.first_char_index + span + 1] == T[last_char_index])
                    break;
                parent_node = edge.splitEdge(active);
            }

            Edge new_edge = new Edge(last_char_index, N, parent_node);
            new_edge.insert();

            if (last_parent_node > 0)
                nodes[last_parent_node].suffix_node = parent_node;

            last_parent_node = parent_node;

            if (active.origin_node == 0)
                active.first_char_index++;
            else
                active.origin_node = nodes[active.origin_node].suffix_node;

            active.canonize();
        }
        if (last_parent_node > 0)
            nodes[last_parent_node].suffix_node = parent_node;
        active.last_char_index++;
        active.canonize();
    }

    /**
     * Function to print all contents and details of suffix tree
     **/
    public void dump_edges(int current_n) {
        System.out.println(" Start  End  Suf  First Last  String\n");
        for (int j = 0; j < HASH_TABLE_SIZE; j++) {
            Edge s = edges[j];
            if (s.start_node == -1)
                continue;
            System.out.printf("%5d %5d %3d %5d %6d   ", s.start_node, s.end_node, nodes[s.end_node].suffix_node, s.first_char_index, s.last_char_index);

            int top;
            if (current_n > s.last_char_index)
                top = s.last_char_index;
            else
                top = current_n;
            for (int l = s.first_char_index; l <= top; l++)
                System.out.print(T[l]);
            System.out.println();
        }
    }

    /**
     * Class suffix
     **/
    class suffix {
        public int origin_node;
        public int first_char_index;
        public int last_char_index;

        /**
         * Constructor
         **/
        public suffix(int node, int start, int stop) {
            origin_node = node;
            first_char_index = start;
            last_char_index = stop;
        }

        /**
         * Function implicit
         **/
        public boolean implicit() {
            return first_char_index > last_char_index;
        }

        /**
         * Function explicit
         **/
        public boolean explicit() {
            return first_char_index > last_char_index;
        }

        /**
         * Function canonize()
         * A suffix in the tree is denoted by a suffix structure
         * that denotes its last character.  The canonical
         * representation of a suffix for this algorithm requires
         * that the origin_node by the closest node to the end
         * of the tree.  To force this to be true, we have to
         * slide down every edge in our current path until we
         * reach the final node
         **/
        public void canonize() {
            if (!explicit()) {
                Edge edge = find(origin_node, T[first_char_index]);
                int edge_span = edge.last_char_index - edge.first_char_index;

                while (edge_span <= (last_char_index - first_char_index)) {
                    first_char_index = first_char_index + edge_span + 1;
                    origin_node = edge.end_node;

                    if (first_char_index <= last_char_index) {
                        edge = find(edge.end_node, T[first_char_index]);
                        edge_span = edge.last_char_index - edge.first_char_index;
                    }
                }
            }
        }
    }

    /**
     * Class Edge
     **/
    class Edge {
        public int first_char_index;
        public int last_char_index;
        public int end_node;
        public int start_node;

        /**
         * Constructor
         **/
        public Edge() {
            start_node = -1;
        }

        /**
         * Constructor
         **/
        public Edge(int init_first, int init_last, int parent_node) {
            first_char_index = init_first;
            last_char_index = init_last;
            start_node = parent_node;
            end_node = Node.count++;
        }

        /**
         * function insert ()
         * A given edge gets a copy of itself inserted into the table
         * with this function.  It uses a linear probe technique, which
         * means in the case of a collision, we just step forward through
         * the table until we find the first unused slot.
         **/
        public void insert() {
            int i = hash(start_node, T[first_char_index]);

            while (edges[i].start_node != -1)
                i = ++i % HASH_TABLE_SIZE;

            edges[i] = this;
        }

        /**
         * function splitEdge ()
         * This function is called
         * to split an edge at the point defined by the suffix argument
         **/
        public int splitEdge(suffix s) {
            remove();
            Edge new_edge = new Edge(first_char_index, first_char_index + s.last_char_index - s.first_char_index, s.origin_node);
            new_edge.insert();
            nodes[new_edge.end_node].suffix_node = s.origin_node;
            first_char_index += s.last_char_index - s.first_char_index + 1;
            start_node = new_edge.end_node;
            insert();
            return new_edge.end_node;
        }

        /**
         * function remove ()
         * This function is called to remove an edge from hash table
         **/
        public void remove() {
            int i = hash(start_node, T[first_char_index]);

            while (edges[i].start_node != start_node ||
                    edges[i].first_char_index != first_char_index)
                i = ++i % HASH_TABLE_SIZE;

            for (; ; ) {
                edges[i].start_node = -1;
                int j = i;

                for (; ; ) {
                    i = ++i % HASH_TABLE_SIZE;
                    if (edges[i].start_node == -1)
                        return;
                    int r = hash(edges[i].start_node, T[edges[i].first_char_index]);
                    if (i >= r && r > j)
                        continue;
                    if (r > j && j > i)
                        continue;
                    if (j > i && i >= r)
                        continue;
                    break;
                }

                edges[j] = edges[i];
            }
        }
    }
}