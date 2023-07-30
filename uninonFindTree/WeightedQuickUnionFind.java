package git.uninonFindTree;

public class WeightedQuickUnionFind {
    private int[] parent;
    private int[] size;

    public WeightedQuickUnionFind(int n) {
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    private int findRoot(int p) {
        while (p != parent[p]) {
            // Path compression: Set each node to point directly to its grandparent
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }

    public boolean isConnected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    public void union(int p, int q) {
        int rootP = findRoot(p);
        int rootQ = findRoot(q);
        if (rootP == rootQ) {
            return;
        }

        // Weighted union: Attach the smaller tree to the root of the larger tree
        if (size[rootP] < size[rootQ]) {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
            System.out.println("Union: " + p + " <- " + q + ", Component sizes: [" + size[rootP] + " <- " + size[rootQ] + "]");
        } else {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
            System.out.println("Union: " + q + " <- " + p + ", Component sizes: [" + size[rootP] + " <- " + size[rootQ] + "]");
        }
    }

    public static void main(String[] args) {
        int n = 10; // Example: Create a union-find data structure with 10 elements (0 to 9)
        WeightedQuickUnionFind uf = new WeightedQuickUnionFind(n);

        // Perform union operations
        uf.union(0, 1);
        uf.union(2, 3);
        uf.union(4, 5);
        uf.union(6, 7);
        uf.union(8, 9);
        uf.union(0, 2);
        uf.union(4, 6);
        uf.union(0, 4);

        // Check if elements are connected
        System.out.println("Is 0 connected to 5? " + uf.isConnected(0, 5)); // Output: true
        System.out.println("Is 1 connected to 8? " + uf.isConnected(1, 8)); // Output: false
    }
}
