public class Queue{
    private LinkedList value;

    public Queue(){
        value = new LinkedList();
    }

    public void add(Node item){
        value.append(item);
    }

    public Node remove(){
        return value.remove(0);
    }

    public Node peek(){
        return value.getFront();
    }

    public boolean empty(){
        return value.getFront() == null;
    }

    public int search(Node item){
        Node curr = value.getFront();
        int index = 0;
        while(curr!=null){
            if(curr==item){
                return index;
            }
            index++;
            curr = curr.getNext();
        }
        return -1;
    }
}