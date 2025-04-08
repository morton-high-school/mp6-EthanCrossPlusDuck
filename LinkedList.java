public class LinkedList{
    private Node front;

    public LinkedList(){}

    public Node getFront(){
        return front;
    }

    public void append(Node node){
        if(front==null){
            front = node;
            return;
        }
        Node curr = front;
        while(curr.getNext()!=null){
            curr = curr.getNext();
        }
        curr.setNext(node);
    }

    public void insert(Node node, int index){
        if(index==0){
            node.setNext(front);
            front = node;
            return;
        }
        Node curr = front;
        for(int i=0;i<index-1 && curr.getNext()!=null;i++){
            curr = curr.getNext();
        }
        node.setNext(curr.getNext());
        curr.setNext(node);
    }

    public Node remove(int index){
        if(index==0){
            Node out = front;
            front = out.getNext();
            out.setNext(null);
            return out;
        }
        Node curr = front;
        for(int i=0;i<index-1 && curr.getNext()!=null;i++){
            curr = curr.getNext();
        }
        Node out = curr.getNext();
        if(curr.getNext()!=null){
            curr.setNext(curr.getNext().getNext());
            out.setNext(null);
        }
        return out;
    }

    public String toString(){
        if(front==null){
            return "There are no items in this list.";
        }
        int len = 0;
        Node curr = front;
        String out = "";
        while(curr!=null){
            out += "Index: " + len + " Data: " + curr.getData() + "\n";
            curr = curr.getNext();
            len++;
        }
        return out;
    }
}