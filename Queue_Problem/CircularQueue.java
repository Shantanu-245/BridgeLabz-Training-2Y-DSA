import java.util.*;
class CircularQueue {
    static int[] q;
    static int front = -1, rear = -1, size;

    static void enqueue(int x){
        if((rear+1)%size == front){
            System.out.println("Overflow");
            return;
        }
        if(front==-1) front=0;
        rear = (rear+1)%size;
        q[rear] = x;
    }

    static void dequeue(){
        if(front==-1){
            System.out.println("Underflow");
            return;
        }
        System.out.print(q[front] + " ");
        if(front==rear){
            front=rear=-1;
        } else {
            front = (front+1)%size;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        q = new int[size];

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            enqueue(sc.nextInt());
        }

        for(int i=0;i<n;i++){
            dequeue();
        }
    }
}