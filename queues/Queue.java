public class Queue {
    // initialize variables
    private static final int SPECIAL_EMPTY_VALUE = -1;
    private static int MAX_SIZE = 10;
    private T[] elements;
    // Head index is initialized as -1 to show there are no values in queue
    private int headIndex = SPECIAL_EMPTY_VALUE;
    private int tailIndex = SPECIAL_EMPTY_VALUE;

    public Queue(Class<T> name){ // take in class of generic type
        // initialze a generic array
        elements = (T[]) Array.newInstance(name, MAX_SIZE);
    }

    // throw exceptions -->

    public void enqeue(T data) {
        tailIndex = (tailIndex + 1) % elements.length;
        elements[tailIndex] = data;

        if (headIndex == SPECIAL_EMPTY_VALUE){
            headIndex = tailIndex;
        }
    }

    public void dequeue(){
        T data = elements[headIndex];

        if(headIndex == tailIndex){
            // if no more values are left after dequeue then set head index to -1
            headIndex = SPECIAL_EMPTY_VALUE;
        } else {
            // move head to next element - wrap around to beginning of the array
            headIndex = (headIndex + 1) % elements.length;
        }

        return data;
    }
}