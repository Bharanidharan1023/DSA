package com.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      Last5 last = new Last5(new PQueue(5));

        Scanner scanner = new Scanner(System.in);

        while(true){
            int option = scanner.nextInt();
            switch (option){
                case 1:{
                    int data = scanner.nextInt();
                    last.addNew(data);
                    break;
                }
                case 2:{
                    last.show();
                    break;
                }
                default:{
                    System.exit(0);
                }
            }
        }
    }
}