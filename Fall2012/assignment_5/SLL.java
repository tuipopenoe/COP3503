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

    public boolean isEmpty(){
        if(this.head == null && this.tail == null){
            return true;
        }

        return false;
    }

    public voiad append(T data){
        Node n = new Node(data);
            if(this.isEmpty()){
                this.head = n;
                this.tail = n;
            }
            else{
                Node temp = this.tail;
                this.temp.next = n;
                this.tail = n;
           }
    }

    public void prepend(T data){
        Node n = new Node(data);
        if(this.isEmpty()){
            this.head = n;
            this.tail = n;
        }
        else{
            n.next = this.head;
            this.head = n;
        }
    }

    public boolean insert(T data, int index){
        // TODO:
    }

    public Node<T> get(T data){
        Node n = this.head;
        while(this.n.hasNext()){
            if(this.n.data == data){
                return this.n;
            }
            else{
                n = this.n.next;
            }
        }
    }

    public Node<T> get(int index){
        // TODO:
    }

    public int indexOf(T data){
        // TODO:
    }

    public int indexOf(Node<T> node){
        // TODO:
    }

    public boolean remove(T data){
        Node n = this.head;
        while(n.hasNext()){
            if(n.next.data == data){
                Node temp = n.next;
                if(temp.hasNext()){
                    n.next = temp.next;
                }
                else{
                    this.tail = n;
                    n.next = null;
                }
                return true;
            }
        }
        return false;
    }

    public boolean remove(Node<T> node){
        Node n = this.head;
            while(n.hasNext()){
                if(n.next.equals(node)){
                    Node temp = n.next;
                    if(temp.hasNext()){
                        n.next = temp.next;
                    }
                    else{
                        this.tail = n;
                        n.next = null;
                    }
                    return true;
                }
            }
            return false;
    }

    public boolean remove(int index){
        // TODO
    }

    public int size(){
        // TODO:
    }

    public void clear(){
        this.head = null;
        this.tail = null;
    }

}