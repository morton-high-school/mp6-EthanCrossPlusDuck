public class LinkedListUtil{
    
    public static int length(LinkedList value){
        Node curr = value.getFront();
        int len = 0;
        while(curr!=null){
            curr = curr.getNext();
            len++;
        }
        return len;
    }

    public static int search(LinkedList value, int data){
        Node curr = value.getFront();
        int index = 0;
        while(curr!=null){
            if(curr.getData()==data){
                return index;
            }
            index++;
            curr = curr.getNext();
        }
        return -1;
    }

    public static Node getNode(LinkedList value, int index){
        int i = 0;
        Node curr = value.getFront();
        while(curr!=null){
            if(index==i){
                return curr;
            }
            curr = curr.getNext();
            i++;
        }
        return null;
    }

    public static int count(LinkedList value, int data){
        int count = 0;
        Node curr = value.getFront();
        while(curr!=null){
            if(curr.getData()==data){
                count++;
            }
            curr = curr.getNext();
        }
        return count;
    }

    public static boolean compare(LinkedList value1, LinkedList value2){
        Node curr1 = value1.getFront();
        Node curr2 = value2.getFront();
        while(curr1!=null && curr2!=null){
            if(curr1.getData()!=curr2.getData()){
                return false;
            }
            curr1 = curr1.getNext();
            curr2 = curr2.getNext();
        }
        if(curr1==null && curr2==null){
            return true;
        }
        return false;
    }

    public static LinkedList reverse(LinkedList value){
        Node curr = value.getFront();
        Node currnew = null;
        while(curr!=null){
            Node newnode = new Node(curr.getData());
            newnode.setNext(currnew);
            currnew = newnode;

            curr = curr.getNext();
        }
        LinkedList out = new LinkedList();
        out.append(currnew);
        return out;
    }
}