package stacklinkedlist;

public class Runner {

    
    public static void main(String[] args) {
        StackLinkedList newStack = new StackLinkedList(5);
        
        //DATA INSERTION
        newStack.push(10);
        newStack.push(30);
        newStack.pop();
        newStack.push(80);
        newStack.pop();

        newStack.print();
    }

}
