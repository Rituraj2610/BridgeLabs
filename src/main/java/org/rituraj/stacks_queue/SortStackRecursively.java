package org.rituraj.stacks_queue;

import java.util.Stack;

class SortStackRecursively {

    public static void sortStack(Stack<Integer> stack) {
       if(!stack.isEmpty()){
           int top = stack.pop();
           sortStack(stack);
           insertSorted(stack, top);
       }
    }


    private static void insertSorted(Stack<Integer> stack, int element) {
        if(stack.isEmpty() || stack.peek() <= element){
            stack.add(element);
            return;
        }

        int top = stack.pop();
        insertSorted(stack, element);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}

