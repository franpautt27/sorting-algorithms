/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queuelinkedlist;

/**
 *
 * @author pc
 */
public class Node {
    public int data;
    public Node next;
    
    //Constructor to get the data when called
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
