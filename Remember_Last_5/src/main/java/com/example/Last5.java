package com.example;


import java.util.ArrayList;
import java.util.List;

public class Last5 {

    PQueue queue;

    Last5(PQueue queue){
        this.queue = queue;
    }

    public void addNew(int data){
        if(queue.isFull()){
            queue.Dequeue();
        }
        queue.Enqueue(data);
    }

    public void show(){
        List<Integer> list = new ArrayList<>();
        while(!(queue.isEmpty())){
            list.add(queue.Peek());
            System.out.println(queue.Dequeue());
        }

        for(int i: list){
            addNew(i);
        }
    }

}
