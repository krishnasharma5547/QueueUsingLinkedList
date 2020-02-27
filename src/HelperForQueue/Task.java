package HelperForQueue;

import HelperForQueue.Node;

public class Task {

    private Node start;
    private Node end;

    public Task() {
        start = null;
        end = null;
    }
    // to check Queue empty or not
    public boolean isEmpty() {
        return start == null;
    }

    //  when passing data
    public void insert(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            start = newNode;
            end = start;
        } else {
            end.setNext(newNode);
            end = newNode;
        }
    }
    /*
    // if pass node

    public void insert(Node newNode){
    if(isEmpty()){
        start = newNode;
        end = start;
    }
    else{
        end.setNext(newNode);
        end = newNode;
    }
    */

    //to delete element from start from queue

    public void delete() {
        if (isEmpty()) {
            System.out.println("No Element Found!");
        } else {
            start = start.getNext();
        }
    }

    // to display whole queue
    public void display() {
        Node temp = start;
        if (isEmpty()) {
            System.out.println("No Element to Print!");
        } else {
            while (temp != null) {
                System.out.println(temp.getData());
                temp = temp.getNext();
            }
        }
    }
}