package org.example;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    class MyQueue {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        public MyQueue() {
            this.s1 = s1;
            this.s2 = s2;
        }

        public void push(int x) {
            while(!s2.empty()){
                s1.push(s2.pop());
            }
            s1.push(x);
        }

        public int pop() {
            while(!s1.empty()){
                s2.push(s1.pop());
            }
            return s2.pop();
        }

        public int peek() {
            if(s1.empty() && s2.empty())return -1;
            if(!s1.empty()){
                return s1.get(0);
            }
            else{
                return s2.peek();
            }
        }

        public boolean empty() {
            return s1.empty() && s2.empty();
        }
    }
}
