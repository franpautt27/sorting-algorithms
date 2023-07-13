/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heapsort;

import java.util.Arrays;

/**
 *
 * @author Francisco Pautt Guzmán
 */
public class HeapSort {
    
    private static void heapsort(int[] inputArray){
        int n = inputArray.length;
        // BUILD MAX HEAP
        for (int i = n/2; i >= 0; i--) {
            heapify(inputArray, i, inputArray.length);
        }
        
        // swap the root (largest) element from the heap with the last one and
        // remove it from the heap and apply heapify again
        for (int i = n-1; i > 0; i--) {
            swap(inputArray, 0, i);
            heapify(inputArray, 0, i);
        }
        
        
    }
    
    private static void heapify(int[] inputArray, int currentIndex, int size){
        int maxIndex = currentIndex;
        int leftChildIndex = 2* currentIndex + 1;
        int rightChildIndex = 2*currentIndex + 2;
        // if the position doesn't have children, it's not going to apply any of this
        if(leftChildIndex < size){
            if(inputArray[leftChildIndex] > inputArray[maxIndex]){
                maxIndex = leftChildIndex;
            }
            if(rightChildIndex < size){
                if(inputArray[rightChildIndex] > inputArray[maxIndex]){
                    maxIndex = rightChildIndex;
                }
            }
        }
        if(maxIndex != currentIndex){
           //swap the array positions
           swap(inputArray, currentIndex, maxIndex);
            heapify(inputArray, maxIndex, size);
        }
    }
    
    private static void swap(int[] inputArray, int initialPos, int finalPos){
        int helper = inputArray[initialPos];
        inputArray[initialPos] = inputArray[finalPos];
        inputArray[finalPos] = helper;
    }
    
    private static String printArray(int[] inputArray){
        return Arrays.toString(inputArray);
    }

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] array = {7, 1, 5, 9, 3, 6, 2, 8, 4};
        System.out.println("From this: ");
        System.out.println(printArray(array));
        System.out.println("\n");
        System.out.println("To this: ");
        heapsort(array);
        
        System.out.println(printArray(array));
        
    }
    
}
