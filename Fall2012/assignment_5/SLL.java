// Tui Popenoe
// COP 3503 - Assignment 5
// SLL.java
// ©2014

public class SLL<T>{
    public Node<T> head;
    public Node<T> tail;

    public SLL(){
        this.head = null;
        this.tail = null;
    }

    public SLL(T data){
        Node<T> node = new Node<T>(data);
        this.head = node;
        this.tail = node;
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
        Node<T> node = new Node<T>(data);
        if(this.isEmpty()){
            this.head = node;
            this.tail = node;
        }
        else{
            this.tail.next = node;
            this.tail = node;
       }
    }

    public void prepend(T data){
        Node<T> node = new Node<T>(data);
        if(this.isEmpty()){
            this.head = node;
            this.tail = node;
        }
        else{
            node.next = this.head;
            this.head = node;
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
        Node<T> node = this.head;
        while(node.next != null){
            if(node.data == data){
                return node;
            }
            else{
                node = node.next;
            }
        }
        return null;
    }

    public Node<T> get(int index){
        int position = 0;
        Node<T> currentNode = this.head;
        if(index < 0){
            return null;
        }
        while(true){
            if(currentNode == null){
                return null;
            }
            if(position == index){
                return currentNode;
            }
            else{
                currentNode = currentNode.next;
                position++;
            }
        }
    }

    public int indexOf(T data){
        Node<T> currentNode = this.head;
        int index = 0;
        while(true){
            if(currentNode == null){
                return -1;
            }
            if(data.equals(currentNode.data)){
                return index;
            }
            else{
                index++;
                currentNode = currentNode.next;
            }
        }
    }

    public int indexOf(Node<T> node){
        Node<T> currentNode = this.head;
        int index = 0;

        while(true){
            if(currentNode == null){
                return -1;
            }
            if(node.equals(currentNode)){
                return index;
            }
            else{
                index ++;
                currentNode = currentNode.next;
            }
        }
    }

    public boolean remove(T data){
        Node<T> node = this.head;
        while(node.next != null){
            if(node.next.data.equals(data)){
                Node<T> tempNode = node.next;
                if(tempNode.next != null){
                    node.next = tempNode.next;
                }
                else{
                    this.tail = node;
                    node.next = null;
                }
                return true;
            }
        }
        return false;
    }

    public boolean remove(Node<T> node){
        Node<T> currentNode = this.head;
        while(currentNode.next != null){
            if(currentNode.next.equals(node)){
                Node<T> tempNode = currentNode.next;
                if(tempNode.next != null){
                    currentNode.next = tempNode.next;
                }
                else{
                    this.tail = currentNode;
                    currentNode.next = null;
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
        if(this.head == null){
            return size;
        }
        while(true){
            if(currentNode.next != null){
                currentNode = currentNode.next;
                size++;
            }
            else{
                return size;
            }
        }
    }

    public void clear(){
        this.head = null;
        this.tail = null;
    }

}