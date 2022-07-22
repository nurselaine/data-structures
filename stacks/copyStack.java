public static Stack<Integer> copyStack(Stack<Integer> s){
        // s - 3, 7, 1
        // storage -
        // copy - 3, 7, 1

    Stack<Integer> copy = new Stack<>();
    Queue<Integer> storage = new LinkedList<>();

    while (!s.isEmpty()) {
        int n = s.pop();
        copy.push(n);
    }

    while (!copy.isEmpty()) {
        int n = copy.pop();
        s.push(n);
        storage.enqueue(n);
    }

    while (!storage.isEmpty()) {
        copy.push(storage.dequeue());
    };

    return copy;
}