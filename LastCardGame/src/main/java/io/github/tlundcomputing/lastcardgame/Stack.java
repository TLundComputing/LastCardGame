package io.github.tlundcomputing.lastcardgame;

public class Stack<T> {

    private final T[] STACK;
    private int pointer;
    private final int MAX_SIZE;

    public Stack(int theSize){
        MAX_SIZE = theSize;
        STACK = (T[]) new Object[MAX_SIZE];
        pointer = -1;
    }

    private boolean isFull(){
        return MAX_SIZE <= pointer;
    }

    private boolean isEmpty(){
        return pointer == -1;
    }

    public void push(T item){
        if(isFull()){
            System.out.println("Stack is full can't push item");
        } else {
            pointer += 1;
            STACK[pointer] = item;
            System.out.println("Item pushed to stack!");
        }
    }

}
