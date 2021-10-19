class queueOps 
{
    int front, rear, size;
    int queue[];

    public queueOps(int capacity)
    {
        this.size = capacity;
        this.front = this.rear = -1;
        queue = new int[this.size];
    }

    boolean isFull(queueOps queue)
    {
        return (queue.rear==queue.size-1);
    }

    boolean isEmpty(queueOps queue)
    {
        return (queue.front==-1 || queue.front>queue.rear);
    }

    void enqueue(int item)
    {
        if(isFull(this))
            System.out.println("Queue Overflow");
        else
        {
            if(this.front==-1 && this.rear==-1)
                this.front = this.rear = 0;
            else
                this.rear+=1;
            this.queue[this.rear]=item;
        }
    }

    int dequeue()
    {
        if(isEmpty(this))
        {
            System.out.println("Queue Underflow");
            return Integer.MIN_VALUE;
        }
        else
        {
            int item = this.queue[this.front];
            if(this.front==this.rear)
                this.front = this.rear = -1;
            else
                this.front+=1;
            return item;
        }
    }

    int front()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        else
            return this.queue[this.front];
    }

    int rear()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        else
            return this.queue[this.rear];
    }

    public static void main(String[] args)
    {
        queueOps queue = new queueOps(100);
 
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
 
        System.out.println(queue.dequeue()
                           + " dequeued from queue\n");
 
        System.out.println("Front item is "
                           + queue.front());
 
        System.out.println("Rear item is "
                           + queue.rear());
    }
}
    
