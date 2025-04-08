public class Stack{
    private LinkedList value;

    public Stack(){
        value = new LinkedList();
    }

    public void push(Node item){
        value.insert(item, 0);
    }

    public Node pop(){
        return value.remove(0);
    }

    public Node peek(){
        return LinkedListUtil.getNode(value, 0);     
    }

    public boolean empty(){
        return value.getFront()==null;
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