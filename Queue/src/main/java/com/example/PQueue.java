package com.example;

public class PQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    PQueue(int capacity){
        front = 0;
        rear = -1;
        this.capacity = capacity;
        size = 0;
        queue = new int[capacity];
    }

    public String Enqueue(int data){
        if(isFull()){
            return "Queue is Full";
        }
        rear = (rear+1)%capacity;
        size++;
        queue[rear] = data;

        return "Data Added Successfully";
    }

    public int Dequeue(){
        if(isEmpty()) return -1;

        int data = queue[front];
        front = (front+1)%capacity;
        size--;

        return data;
    }

    public int Peek(){
        if(isEmpty()) return -1;

        return queue[front];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == capacity;
    }
}
