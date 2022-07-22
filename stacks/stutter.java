public class stutter{

    public static void stutter(Stack<Integer> s){
        // traverse through stack using a loop
        for(int i = 0; i < s.size(); i++){
            // find every even index element
            if(i % 2 == 0){
                // save element at index i to a saver variable
                int element = s.get(i);
                // use saver varible to add element at every even index
                s.add(i, element);
            }
        }
    }
}