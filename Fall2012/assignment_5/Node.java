public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(){
        this.data = null;
        this.head = null;
    }

    public Node(T data){
        this.data = data;
        this.next = null;
    }

    public Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }

    public String toString(){
        if(data == null){
            return null;
        }
        else{
            return data.toString();
        }
    }
}
