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

    public void append(T data){
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
        Node<T> currentNode = this.head;
        int position = 0;

        while(true){
            if(currentNode == null){
                break;
            }
            if(position + 1 == index){
                Node<T> tempNode = new Node<T>(data);
                tempNode.next = currentNode.next;
                currentNode.next = tempNode;
                return true;
            }
            else{
                currentNode = currentNode.next;
                position++;
            }
        }
        return false;
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
        int position = 0;
        Node<T> currentNode = this.head;
        if(index < 0){
            return null;
        }
        while(true){
            if(currentNode == null){
                break;
            }
            if(position == index){
                return currentNode;
            }
            else{
                currentNode = currentNode.next;
                position++;
            }
        }
        return null;
    }

    public int indexOf(T data){
        Node<T> node = new Node(data);
        Node<T> currentNode = this.head;
        int index = 0;
        boolean found = false;

        while(!found){
            if(currentNode == null){
                break;
            }
            if(node.equals(currentNode)){
                found = true;
                return index;
            }

            index ++;
            currentNode = currentNode.next;
        }

        if(!found){
            return -1;
        }
    }

    public int indexOf(Node<T> node){
        Node<T> currentNode = this.head;
        int index = 0;
        boolean found = false;

        while(!found){
            if(currentNode == null){
                break;
            }
            if(node.equals(currentNode)){
                found = true;
                return index;
            }

            index ++;
            currentNode = currentNode.next;
        }

        if(!found){
            return -1;
        }
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
        Node<T> priorNode = this.head;
        if(index < 0){
            return false;
        }
        if(index == 0){
            this.head = this.head.next;
            priorNode.next = null;
            return true;
        }
        else{
            priorNode = get(index -1);
            if(priorNode != null){
                Node<T> tempNode = priorNode.next;
                tempNode = tempNode.next;
                priorNode.next = tempNode;
                return true;
            }
        }
        return false;
    }

    public int size(){
        int size = 0;
        Node<T> currentNode = this.head;
        while(true){
            if(currentNode.next != null){
                currentNode = currentNode.next;
                size++;
            }
            else{
                return size;
            }
        }
        return 0;
    }

    public void clear(){
        this.head = null;
        this.tail = null;
    }

}