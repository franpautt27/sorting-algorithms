package queuelinkedlist;

public class QueueLinkedList {

    Node front = null;

    Node rear = null;
    int frontPosition = -1;
    int rearPosition = -1;
    int length;

    public QueueLinkedList(int length) {
        this.length = length;
    }

    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("OVERFLOW CONDITION");
            return;
        } else {
            Node newNode = new Node(x, null);
           
           
            if(front == null){
                this.front = newNode;
                this.rear = this.front;
                this.frontPosition++;
                this.rearPosition++;
                
            }else{
                rear.next = newNode;
                rear = newNode;
                rearPosition++; 
            }
        }
    }

    public boolean isFull() {
        return this.rearPosition == this.length - 1;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("No elements in this Queue");
        } else {
            Node currentNode = front;
            while (currentNode != null) {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("UNDERFLOW CONDITION");
            return;
        } else {
            Node nodeToRemove = this.front;
            this.front = nodeToRemove.next;
            
            if (this.rearPosition == this.frontPosition) {
                this.frontPosition--;
            }
            this.rearPosition--;

        }
    }

    public boolean isEmpty() {
        return this.frontPosition == -1 && this.rearPosition == -1;
    }

}
