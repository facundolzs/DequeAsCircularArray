package doubleEndendQueue;

public class Deque {

    private int[] deque;
    private int front = -1;
    private int rear = -1;
    private int size;
    private static final int DEFAULT_SIZE = 10;

    public Deque() {
        this(DEFAULT_SIZE); // constructor chaining
    }

    public Deque(int size) {
        this.size = size;
        deque = new int[size];
    }

    /**
     * Check if the deque is fully or not
     *
     * @return
     */
    public boolean isFull() {
        return ((front == 0 && rear == size - 1) || front == rear + 1);
    }

    /**
     * Check if the deque is empty or not
     *
     * @return true if no elements were added
     */
    public boolean isEmpty() {
        return front == -1;
    }

    /**
     * Insert new element at front
     *
     * @param value (new value to add)
     */
    public void insertAtFront(int value) {

        if (!isFull()) {
            if (isEmpty()) {
                front = rear = 0;
            } else if (front == 0) {
                front = (size - 1);
            } else {
                front--;
            }
            deque[front] = value;
            System.out.println("Added (front): " + value);
        } else {
            System.out.println("Deque is full! Cannot add element " + value + ".");
        }
    }

    /**
     * Insert new element at rear
     *
     * @param value (new value to add)
     */
    public void insertAtRear(int value) {

        if (!isFull()) {
            if (isEmpty()) {
                front = rear = 0;
            } else if (rear == size - 1) {
                rear = 0;
            } else {
                rear++;
            }
            deque[rear] = value;
            System.out.println("Added (rear): " + value);
        } else {
            System.out.println("Deque is full! Cannot add element " + value + ".");
        }
    }

    /**
     * Delete from the front
     */
    public void deleteAtFront() {

        if (isEmpty()) {
            System.out.println("Deque is empty! Cannot delete elements.");
            return;
        }

        int element = deque[front];

        if (front == rear) {
            front = rear = -1;
        } else if (front == (size - 1)) {
            front = 0;
        } else {
            front++;
        }

        System.out.println("Deleted (front): " + element);
    }

    /**
     * Delete from the rear
     */
    public void deleteAtRear() {

        if (isEmpty()) {
            System.out.println("Deque is empty! Cannot delete elements.");
            return;
        }

        int element = deque[rear];

        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = (size - 1);
        } else {
            rear--;
        }

        System.out.println("Deleted (rear): " + element);
    }

    /**
     * Display the deque
     */
    public void print() {

        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return;
        }

        int i = front;
        boolean finish = false;
        System.out.println("Index | Element");

        while (!finish) {

            String ptr = "";

            if (i == front && front == rear) {
                ptr = " <- front & rear";
            } else if (i == front) {
                ptr = " <- front";
            } else if (i == rear) {
                ptr = " <- rear";
            }

            System.out.println("[" + i + "]   | " + deque[i] + ptr);

            if (i == rear) {
                finish = true;
            } else if (i == size - 1) {
                i = 0;
            } else {
                i++;
            }
        }
    }

}
