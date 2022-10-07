package src.ss11_stack_queue.bai_tap;

public class CircularQueue {
    static class Node {
        int data;
        Node link;
    }

    static class Queue {
        Node front, rear;

        public Queue() {
            front = rear =null;
        }
    }

    static void enQueue(Queue queue, int value) {
        Node temp = new Node();
        temp.data = value;
        if (queue.front == null) {
            queue.front = temp;
        } else {
            queue.rear.link = temp;
        }
        queue.rear = temp;
        queue.rear.link = queue.front;
    }

    static int deQueue(Queue queue) {
        if (queue.front == null) {
            System.out.printf("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (queue.front == queue.rear) {
            value = queue.front.data;
            queue.front = queue.rear = null;
        } else {
            value = queue.front.data;
            queue.front = queue.front.link;
            queue.rear.link= queue.front;
        }
        return value;
    }
    static void displayQueue(Queue queue){
        Node temp = queue.front;
        System.out.println("Queue");
        while (temp.link != queue.front){
            System.out.printf(temp.data+" ");
            temp= temp.link;
        }
        System.out.printf(temp.data+" ");

    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        enQueue(queue,1);
        enQueue(queue,2);
        enQueue(queue,3);
        deQueue(queue);
        enQueue(queue,4);
        enQueue(queue,5);
        deQueue(queue);
        displayQueue(queue);
    }
}
