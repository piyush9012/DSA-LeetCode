class LRUCache {

    class Node{
        int key, value;
        Node next, prev;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    Map<Integer, Node> map = new HashMap<>();
    Node head = new Node(0,0), tail = new Node(0,0);
    int cap;

    private void insert(Node node){
        map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    private void delete(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            delete(node);
            insert(node);
            return node.value;
        }
        else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            delete(map.get(key));
        }
        if(map.size() == cap){
            delete(tail.prev);
        }
        insert(new Node(key, value));
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */