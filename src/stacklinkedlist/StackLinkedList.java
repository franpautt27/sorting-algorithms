package stacklinkedlist;

public class StackLinkedList {

    Node top = null;
    int length;
    int topPosition = -1;

    public StackLinkedList(int length) {
        this.length = length;
    }

    // to optimize this method into O(1), all the insertions will be at the beggining
    public void push(int x) {
        if (isFull()) {
            System.out.println("OVERFLOW CONDITION");
            return;
        }else{
            
            Node newNode = new Node(x, this.top);
            this.top = newNode;
            this.topPosition++;
        }

    }
    // we are going to remove the very first element, also has a time complexity of O(1)
    public void pop(){
        if(isEmpty()){
            System.out.println("UNDERFLOW CONDITION");
            return;
        }else{
            Node currentTop = this.top;
            Node newTop = currentTop.next;
            this.top = newTop;
            this.topPosition--;
        }
    }
    
    public boolean isEmpty(){
        return this.topPosition == -1;
    }
    
    public boolean isFull(){
        return this.topPosition >= this.length-1;
    }
    
    public void print(){
        if(isEmpty()){
            System.out.println("No elements in this Stack");
        }else{
            Node currentNode = top;
            while (currentNode.next != null) {                
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
            System.out.println(currentNode.data);
           
        }
    }
}
