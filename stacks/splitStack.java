/*
    rearrange a given stack to organize integers from negatives to non-negatives
    Stack should pop all non-negative integers first then all negative integers
 */
*/

public static void splitStack(Stack<Integer> s){
    // make a stack to hold all positive integers
    Stack<Integer> positiveNumbers = new Stack<Integer>();

    // traverse through input and remove all even number from stack
    for(int i = s.size() -1; i >= 0; i--){
        if(s.get(i) >= 0){
            // add numbers to evenNumbers stack
            positiveNumbers.add(s.get(i));
            s.remove(i);
        }
    }

    // use a while loop to add all elements in even numbers to s stack
    while(!positiveNumbers.isEmpty()){
        // define a saver variable and pop off evenNumber element
        int element = positiveNumbers.pop();
        // add the saver element to the top of stack s
        s.add(element);
    }
}