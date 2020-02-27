package MyQueueMain;

import HelperForQueue.Task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task t = new Task();
        t.insert(10);
        t.insert(20);
        t.insert(30);
        t.insert(40);
        t.insert(50);
        t.delete();
        t.display();
    }
}

