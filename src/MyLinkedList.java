

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public  void  add(int index, Object data ){
        Node temple = head;
        Node holder;
        for (int i = 0; i < index -1 && temple.next != null; i++){
            temple = temple.next;
        }
        holder = temple.next;
        temple.next = new Node(data);
        temple.next.next = holder;
        numNodes++;
    }
    public  void  addFirst(Object data){
        Node temple = head;
        head = new Node(data);
        head.next = temple;
        numNodes++;
    }
    public  Node get(int index){
        Node temp = head;
        for (int i =0; i< index; i++){
            temp = temp.next;
        }
        return temp;
    }
    public  void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
