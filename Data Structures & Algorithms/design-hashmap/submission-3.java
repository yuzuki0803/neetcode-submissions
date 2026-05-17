class Node {
    private int key;

    private int value;

    private Node next;

    public Node() {
        this(-1, -1, null);
    }

    public Node(int key, int value, Node next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Node(int key, int val) {
        this(key, val, null);
    }
}

class MyHashMap {
    private final Node[] table;

    public MyHashMap() {
        table = new Node[1 << 15];
        for (int i = 0; i < table.length; i++) {
            table[i] = new Node();
        }
    }

    public void put(int key, int value) {
        Node curr = table[hash(key)];

        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next.value = value;
                return;
            }
            curr = curr.next;
        }
        curr.next = new Node(key, value);
    }

    public int get(int key) {
        Node curr = table[hash(key)];

        while (curr.next != null) {
            if (curr.next.key == key) {
                return curr.next.value;
            }
            curr = curr.next;
        }

        return -1;
    }

    public void remove(int key) {
        int hash = hash(key);
        Node curr = table[hash];

        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }

    private int hash(int key) {
        return key & (table.length - 1);
    }
}
