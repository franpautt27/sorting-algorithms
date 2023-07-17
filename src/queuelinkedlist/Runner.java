
package queuelinkedlist;


public class Runner {

   
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList(5);
        queue.enqueue(4);
        queue.enqueue(1);
        queue.enqueue(3);
        queue.dequeue();
        queue.enqueue(8);
        queue.dequeue();
        
      
        
        
        queue.print();
    }
    
}
