package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        PQueue queue = new PQueue(3);

        queue.Enqueue(1);// _ _ _
        queue.Enqueue(2); // 1 2 _
        queue.Dequeue(); // _ 2 _
        queue.Enqueue(3); // _ 2 3
        queue.Dequeue(); // _ _ 3
        queue.Enqueue(4);// 4 _ 3
    }
}