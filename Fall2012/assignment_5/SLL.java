public class SLL<T>{
    public Node<T> head;
    public Node<T> tail;

    public SLL(){
        this.head = null;
        this.tail = null;
    }

    public SLL(T data){
        Node n = new Node(data);
        this.head = n;
        this.tail = n;
    }

    public SLL(Node<T> node){
        this.head = node;
        this.tail = node;
    }

    public SLL(Node<T> head, Node<T> tail){
        this.head = head;
        this.tail = tail;
    }


}