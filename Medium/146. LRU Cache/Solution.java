// Using Doubly Linked List
class Node {
    int key = 0, val = 0;
    Node prev, next;

    Node() {}
    Node(int k, int v) {
        key = k;
        val = v;
    }
}
class LRUCache {
    Node head, tail;
    HashMap<Integer, Node> map;
    int maxCap;
    public LRUCache(int capacity) {
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;

        maxCap = capacity;
        map = new HashMap<>(maxCap);
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        removeAlreadyExistingNode(key);
        updateRecentlyUsed(key, map.get(key).val);

        return map.get(key).val;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key))
            removeAlreadyExistingNode(key);
        else if (map.size() == maxCap) {
            map.remove(tail.prev.key);
            tail.prev.prev.next = tail;
            tail.prev = tail.prev.prev;
        }
        updateRecentlyUsed(key, value);
    }
    private void removeAlreadyExistingNode(int key) {
        Node existingNode = map.get(key);
        existingNode.prev.next = existingNode.next;
        existingNode.next.prev = existingNode.prev;
        existingNode = null;
    }
    private void updateRecentlyUsed(int key, int value) {
        Node newNode = new Node(key, value);
        newNode.next = head.next;   // (h)(new)->(t)
        newNode.prev = head;  // (h)<-(new)(t)
        head.next = newNode;    // (h)->(new)(t)
        newNode.next.prev = newNode;    // (h)(new)<-(t)

        map.put(key, newNode);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */